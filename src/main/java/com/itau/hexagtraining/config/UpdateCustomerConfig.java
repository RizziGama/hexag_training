package com.itau.hexagtraining.config;

import com.itau.hexagtraining.adapters.out.FindAddressByZipCodeAdapter;
import com.itau.hexagtraining.adapters.out.FindCustomerByIdAdapter;
import com.itau.hexagtraining.adapters.out.UpdateCustomerAdapter;
import com.itau.hexagtraining.application.core.usecase.FindCustomerByIdUseCase;
import com.itau.hexagtraining.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
