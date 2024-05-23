package com.itau.hexagtraining.adapters.out.client.mapper;

import com.itau.hexagtraining.adapters.out.client.response.AddressResponse;
import com.itau.hexagtraining.adapters.out.repository.entity.AddressEntity;
import com.itau.hexagtraining.application.core.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    @Mapping(target = "street", source = "street")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "state", source = "state")
    Address toAddress(AddressResponse addressResponse);


}
