package com.itau.hexagtraining.adapters.out;

import com.itau.hexagtraining.application.ports.out.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfForValidationAdapter implements SendCpfForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> KafkaTemplate;

    @Override
    public void send(String cpf) {
        KafkaTemplate.send("tp-cpf-validation", cpf);


    }
}
