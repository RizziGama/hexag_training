package com.itau.hexagtraining.application.ports.out;

import com.itau.hexagtraining.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
