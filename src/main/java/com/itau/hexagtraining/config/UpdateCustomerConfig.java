package com.itau.hexagtraining.config;

import com.itau.hexagtraining.adapters.out.FindAddressByZipCodeAdapter;
import com.itau.hexagtraining.adapters.out.FindCustomerByIdAdapter;
import com.itau.hexagtraining.adapters.out.UpdateCustomerAdapter;
import com.itau.hexagtraining.application.core.usecase.FindCustomerByIdUseCase;
import com.itau.hexagtraining.application.core.usecase.UpdateCustomerUseCase;
import com.itau.hexagtraining.application.ports.in.FindCustomerByIdInputPort;
import com.itau.hexagtraining.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {


    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
           FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
           FindCustomerByIdUseCase findCustomerByIdUseCase,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
