package com.exampleStock.StockQRApi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Employers")
public class UserDetails {

    @Id
    private UUID id_employer = UUID.randomUUID();
    private String name;
    private String Cpf;
    private String email;


    public UUID getId_employer() {
        return id_employer;
    }

    public void setId_employer(UUID id_employer) {
        this.id_employer = id_employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}

