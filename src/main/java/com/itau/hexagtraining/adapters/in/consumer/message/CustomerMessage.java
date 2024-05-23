package com.itau.hexagtraining.adapters.in.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerMessage {

    public CustomerMessage(String id, String name, String zipCode, String cpf, Boolean validCpf) {
        this.id = id;
        this.name = name;
        this.zipCode = zipCode;
        this.cpf = cpf;
        this.validCpf = validCpf;
    }

    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    private Boolean validCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return validCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        validCpf = validCpf;
    }
}
