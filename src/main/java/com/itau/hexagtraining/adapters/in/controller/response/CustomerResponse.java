package com.itau.hexagtraining.adapters.in.controller.response;

import com.itau.hexagtraining.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private AddressResponse adress;
    private String cpf;
    private Boolean isValidCpf;
}
