package com.itau.hexagtraining.adapters.out.repository.mapper;

import com.itau.hexagtraining.adapters.out.repository.entity.CustomerEntity;
import com.itau.hexagtraining.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.jmx.export.annotation.ManagedOperation;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

   @Mapping(target = "id", source = "id")
   @Mapping(target = "name", source = "name")
   @Mapping(target = "address", source = "address")
   @Mapping(target = "cpf", source = "cpf")
   @Mapping(target = "validCpf", source = "validCpf")
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
