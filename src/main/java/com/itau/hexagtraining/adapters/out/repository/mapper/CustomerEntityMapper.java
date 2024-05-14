package com.itau.hexagtraining.adapters.out.repository.mapper;

import com.itau.hexagtraining.adapters.out.repository.entity.CustomerEntity;
import com.itau.hexagtraining.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.springframework.jmx.export.annotation.ManagedOperation;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
