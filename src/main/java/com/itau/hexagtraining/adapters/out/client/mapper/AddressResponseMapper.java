package com.itau.hexagtraining.adapters.out.client.mapper;

import com.itau.hexagtraining.adapters.out.client.response.AddressResponse;
import com.itau.hexagtraining.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
