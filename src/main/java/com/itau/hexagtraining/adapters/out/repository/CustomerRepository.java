package com.itau.hexagtraining.adapters.out.repository;

import com.itau.hexagtraining.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {


}
