package com.example.WalletProject.models.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.WalletProject.models.Entity.AuthInfo} entity
 */
public class AuthInfoDto implements Serializable {
    private final Long id;
    private final ClientDto client;
    @Size(max = 50)
    @NotNull
    private final String login;
    @NotNull
    private final String password;

    public AuthInfoDto(Long id, ClientDto client, String login, String password) {
        this.id = id;
        this.client = client;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public ClientDto getClient() {
        return client;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthInfoDto entity = (AuthInfoDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.client, entity.client) &&
                Objects.equals(this.login, entity.login) &&
                Objects.equals(this.password, entity.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, login, password);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "client = " + client + ", " +
                "login = " + login + ", " +
                "password = " + password + ")";
    }
}