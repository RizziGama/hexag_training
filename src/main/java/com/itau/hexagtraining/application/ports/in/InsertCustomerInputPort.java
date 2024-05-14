package com.itau.hexagtraining.application.ports.in;

import com.itau.hexagtraining.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

  }
