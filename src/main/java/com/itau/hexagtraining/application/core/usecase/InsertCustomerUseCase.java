package com.itau.hexagtraining.application.core.usecase;

import com.itau.hexagtraining.application.core.domain.Address;
import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.out.FindAddressByZipCodeOutputPort;
import com.itau.hexagtraining.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(InsertCustomerOutputPort insertCustomerOutputPort,
    FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }


    public void Insert(Customer customer, String zipCode ){

        var address = findAddressByZipCodeOutputPort.find(zipCode);

        customer.setAdress(address);
        insertCustomerOutputPort.insert(customer);

    }

}
