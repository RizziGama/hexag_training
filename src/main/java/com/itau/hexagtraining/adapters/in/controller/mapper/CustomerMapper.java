package com.itau.hexagtraining.adapters.in.controller.mapper;

import com.itau.hexagtraining.adapters.in.controller.request.CustomerRequest;
import com.itau.hexagtraining.adapters.in.controller.response.CustomerResponse;
import com.itau.hexagtraining.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel =  "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerReponse(Customer customer);

}
