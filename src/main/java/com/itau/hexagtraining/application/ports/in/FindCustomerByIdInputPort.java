package com.itau.hexagtraining.application.ports.in;

import com.itau.hexagtraining.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
