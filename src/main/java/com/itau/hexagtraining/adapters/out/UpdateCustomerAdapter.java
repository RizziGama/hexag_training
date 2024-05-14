package com.itau.hexagtraining.adapters.out;

import com.itau.hexagtraining.adapters.in.controller.mapper.CustomerMapper;
import com.itau.hexagtraining.adapters.out.repository.CustomerRepository;
import com.itau.hexagtraining.adapters.out.repository.mapper.CustomerEntityMapper;
import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
