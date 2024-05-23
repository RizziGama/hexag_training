package com.itau.hexagtraining.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {
    public CustomerRequest(String name, String cpf, String zipCode) {
        this.name = name;
        this.cpf = cpf;
        this.zipCode = zipCode;
    }

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank String getZipCode() {
        return zipCode;
    }

    public void setZipCode(@NotBlank String zipCode) {
        this.zipCode = zipCode;
    }
}
