package com.itau.hexagtraining.adapters.out;

import com.itau.hexagtraining.adapters.in.controller.request.CustomerRequest;
import com.itau.hexagtraining.adapters.out.repository.CustomerRepository;
import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {


    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);

    }
}
