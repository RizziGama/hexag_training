package com.itau.hexagtraining.adapters.in.consumer;

import com.itau.hexagtraining.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.itau.hexagtraining.adapters.in.consumer.message.CustomerMessage;
import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "rizzi")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
