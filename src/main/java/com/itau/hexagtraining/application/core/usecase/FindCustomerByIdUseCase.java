package com.itau.hexagtraining.application.core.usecase;

import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.in.FindCustomerByIdInputPort;
import com.itau.hexagtraining.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {


    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;


    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(()-> new RuntimeException("Customer not found"));
    }

}
