package com.itau.hexagtraining.adapters.out.repository.entity;


import com.itau.hexagtraining.application.core.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private Address address;

    private String cpf;

    private Boolean validCpf;


    public CustomerEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
