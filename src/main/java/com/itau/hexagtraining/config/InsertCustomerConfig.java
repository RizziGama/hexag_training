package com.itau.hexagtraining.config;

import com.itau.hexagtraining.adapters.out.FindAddressByZipCodeAdapter;
import com.itau.hexagtraining.adapters.out.InsertCustomerAdapter;
import com.itau.hexagtraining.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter
    ){
        return new InsertCustomerUseCase(insertCustomerAdapter,findAddressByZipCodeAdapter);
    }

}
