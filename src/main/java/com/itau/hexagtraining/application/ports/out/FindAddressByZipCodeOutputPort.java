package com.itau.hexagtraining.application.ports.out;

import com.itau.hexagtraining.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find (String zipCode);

}
