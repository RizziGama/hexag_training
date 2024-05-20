package com.itau.hexagtraining.application.core.usecase;

import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.in.InsertCustomerInputPort;
import com.itau.hexagtraining.application.ports.out.FindAddressByZipCodeOutputPort;
import com.itau.hexagtraining.application.ports.out.InsertCustomerOutputPort;
import com.itau.hexagtraining.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(InsertCustomerOutputPort insertCustomerOutputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){

        var address = findAddressByZipCodeOutputPort.find(zipCode);

        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());


    }


}
