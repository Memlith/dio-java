import br.com.dio.dao.UserDAO;
import br.com.dio.exception.CustomException;
import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.exception.ValidatorException;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;
import static br.com.dio.validator.UserValidator.verifyModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
  private final static UserDAO dao = new UserDAO();
  private final static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws EmptyStorageException {
    System.out.println("Bem-Vindo ao Cadastro de Usuarios, selecione a operacao desejada");
    while (true) {
      System.out.println("[1] - Cadastrar");
      System.out.println("[2] - Atualizar");
      System.out.println("[3] - Excluir");
      System.out.println("[4] - Buscar ID");
      System.out.println("[5] - Listar");
      System.out.println("[6] - Sair");
      var userInput = scanner.nextInt();
      var selectedOption = MenuOption.values()[userInput - 1];
      switch (selectedOption) {
        case SAVE -> {
          try {
            var user = dao.save(requestToSave());
            System.out.printf("Usuario salvo %s", user);
          } catch (ValidatorException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
          }
        }

        case UPDATE -> {
          try {
            var user = dao.update(requestToUpdate());
            System.out.printf("Usuario atualizado %s", user);
          } catch (UserNotFoundException | EmptyStorageException ex) {
            System.out.println(ex.getMessage());
          } catch (ValidatorException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
          } finally {
            System.out.println("============== END ==============");
          }
        }
        case DELETE -> {
          try {
            dao.delete(requestId());
            System.out.println("Usuario excluido");
          } catch (UserNotFoundException | EmptyStorageException ex) {
            System.out.println(ex.getMessage());
          } finally {
            System.out.println("============== END ==============");
          }
        }
        case FIND_BY_ID -> {
          try {
            var id = requestId();
            var user = dao.findById(id);
            System.out.printf("Usuario com ID %s: ", id);
            System.out.println(user);
          } catch (UserNotFoundException | EmptyStorageException ex) {
            System.out.println(ex.getMessage());
          } finally {
            System.out.println("============== END ==============");
          }
        }
        case FIND_ALL -> {
          var users = dao.findAll();
          System.out.println("Usuarios cadastrados:");
          System.out.println("================================");
          users.forEach(System.out::println);
          System.out.println("============== END ==============");
        }
        case EXIT -> System.exit(0);
      }
    }
  }

  private static long requestId() {
    System.out.println("Informe o ID do usuario: ");
    return scanner.nextLong();
  }

  private static UserModel requestToSave() throws ValidatorException {
    System.out.println("Informe o nome do usuario: ");
    var name = scanner.next();
    System.out.println("Informe o e-mail do usuario: ");
    var email = scanner.next();
    System.out.println("Informe a data de nascimento do usuario (dd/mm/yyyy): ");
    var birthdayString = scanner.next();
    var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    var birthday = LocalDate.parse(birthdayString, formatter);
    return validateInputs(0, name, email, birthday);

  }

  private static UserModel validateInputs(final long id, final String name,
      final String email, final LocalDate birthday) {
    var user = new UserModel(id, name, email, birthday);
    try {
      verifyModel(user);
      return user;
    } catch (ValidatorException ex) {
      throw new CustomException("O seu modelo usuario erros: " + ex.getMessage(), ex);
    }

  }

  private static UserModel requestToUpdate() throws ValidatorException {
    System.out.println("Informe o ID do usuario: ");
    var id = scanner.nextLong();
    System.out.println("Informe o nome do usuario: ");
    var name = scanner.next();
    System.out.println("Informe o e-mail do usuario: ");
    var email = scanner.next();
    System.out.println("Informe a data de nascimento do usuario (dd/mm/yyyy): ");
    var birthdayString = scanner.next();
    var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    var birthday = LocalDate.parse(birthdayString, formatter);
    return validateInputs(id, name, email, birthday);
  }
}
