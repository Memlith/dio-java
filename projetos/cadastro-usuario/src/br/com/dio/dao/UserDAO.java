package br.com.dio.dao;

import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

  private long nextId = 1L;

  private final List<UserModel> models = new ArrayList<>();

  public UserModel save(final UserModel model) {
    model.setId(nextId++);
    models.add(model);
    return model;

  }

  public UserModel update(final UserModel model) throws EmptyStorageException {
    var toUpdate = findById(model.getId());
    models.remove(toUpdate);
    models.add(model);
    return model;
  }

  public void delete(final long id) throws EmptyStorageException {
    var toDelete = findById(id);
    models.remove(toDelete);
  }

  public UserModel findById(final long id) throws EmptyStorageException {
    verifyStorage();
    var message = String.format("Nao existe o usuario com o id %s cadastrado", id);
    return models.stream()
        .filter(user -> user.getId() == id)
        .findFirst()
        .orElseThrow(() -> new UserNotFoundException(message));
  }

  public List<UserModel> findAll() throws EmptyStorageException {
    List<UserModel> result;
    try {
      verifyStorage();
      result = models;
    } catch (EmptyStorageException ex) {
      ex.printStackTrace();
      result = new ArrayList<>();
    }
    return models;

  }

  private void verifyStorage() throws EmptyStorageException {
    if (models.isEmpty())
      throw new EmptyStorageException("Armazenamento Vazio.");
  }

}
