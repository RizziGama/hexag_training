package com.itau.hexagtraining.config;

import com.itau.hexagtraining.adapters.out.FindCustomerByIdAdapter;
import com.itau.hexagtraining.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class FindCustomerByIdConfig {
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter)
    {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}


