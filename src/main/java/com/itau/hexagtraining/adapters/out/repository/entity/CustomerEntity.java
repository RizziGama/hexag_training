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

    private Boolean isValidCpf;
}
