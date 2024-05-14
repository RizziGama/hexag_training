package com.itau.hexagtraining.config;

import com.itau.hexagtraining.adapters.out.DeleteCustomerByIdAdapter;
import com.itau.hexagtraining.adapters.out.FindCustomerByIdAdapter;
import com.itau.hexagtraining.application.core.usecase.DeleteCustomerByIdUseCase;
import com.itau.hexagtraining.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }

}
