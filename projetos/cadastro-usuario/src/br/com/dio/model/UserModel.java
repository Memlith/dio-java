package br.com.dio.model;

import java.time.LocalDate;
import java.util.Objects;

public class UserModel {
  private long id;
  private String name;
  private String email;
  private LocalDate birthday;

  public UserModel(long id, String name, String email, final LocalDate birthday) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.birthday = birthday;
  }

  public UserModel() {
  }

  public long getId() {
    return this.id;
  }

  public void setId(long value) {
    this.id = value;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String value) {
    this.email = value;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(final LocalDate birthday) {
    this.birthday = birthday;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof UserModel)) {
      return false;
    }
    UserModel userModel = (UserModel) o;
    return id == userModel.id &&
        Objects.equals(name, userModel.name) &&
        Objects.equals(email, userModel.email) &&
        Objects.equals(birthday, userModel.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, birthday);
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", email='" + getEmail() + "'" +
        ", birthday='" + getBirthday() + "'" +
        "}";
  }

}
