package com.itau.hexagtraining.adapters.in.controller;

import com.itau.hexagtraining.adapters.in.controller.mapper.CustomerMapper;
import com.itau.hexagtraining.adapters.in.controller.request.CustomerRequest;
import com.itau.hexagtraining.adapters.in.controller.response.CustomerResponse;
import com.itau.hexagtraining.adapters.out.repository.CustomerRepository;
import com.itau.hexagtraining.application.core.domain.Customer;
import com.itau.hexagtraining.application.ports.in.DeleteCustomerByIdInputPort;
import com.itau.hexagtraining.application.ports.in.FindCustomerByIdInputPort;
import com.itau.hexagtraining.application.ports.in.InsertCustomerInputPort;
import com.itau.hexagtraining.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;
    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;
    @PostMapping
    public ResponseEntity<Void> Insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer,customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerReponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest){
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer,customerRequest.getZipCode());
        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id){
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
