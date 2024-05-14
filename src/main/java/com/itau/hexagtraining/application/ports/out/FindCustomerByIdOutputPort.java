package com.itau.hexagtraining.application.ports.out;

import com.itau.hexagtraining.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
