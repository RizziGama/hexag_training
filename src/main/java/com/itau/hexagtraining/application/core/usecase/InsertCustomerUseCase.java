package com.itau.hexagtraining.application.core.usecase;

import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.in.InsertCustomerInputPort;
import com.itau.hexagtraining.application.ports.out.FindAddressByZipCodeOutputPort;
import com.itau.hexagtraining.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(InsertCustomerOutputPort insertCustomerOutputPort,
    FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){

        var address = findAddressByZipCodeOutputPort.find(zipCode);

        customer.setAdress(address);
        insertCustomerOutputPort.insert(customer);


    }


}
