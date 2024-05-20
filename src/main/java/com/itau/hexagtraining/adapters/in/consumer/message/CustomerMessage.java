package com.itau.hexagtraining.adapters.in.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {
    public String getZipCode() {
        return zipCode;
    }

    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    private Boolean isValidCpf;

}
