package ru.korotaev.mail.model.dto;

import java.util.Objects;
import java.util.UUID;

public class UserDto {
    private UUID id;
    private String login;
    private String mail;
    private Long phone;
    private String password;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDto userDto = (UserDto) o;
        return Objects.equals(id , userDto.id) && Objects.equals(login , userDto.login) && Objects.equals(mail , userDto.mail) && Objects.equals(phone , userDto.phone) && Objects.equals(password , userDto.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id , login , mail , phone , password);
    }
}
