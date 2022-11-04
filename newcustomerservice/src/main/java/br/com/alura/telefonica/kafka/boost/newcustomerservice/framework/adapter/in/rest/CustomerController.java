package br.com.alura.telefonica.kafka.boost.newcustomerservice.framework.adapter.in.rest;

import br.com.alura.telefonica.kafka.boost.newcustomerservice.application.port.in.CustomerUseCase;
import br.com.alura.telefonica.kafka.boost.newcustomerservice.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerUseCase useCase;

    @PostMapping
    public ResponseEntity<Void> sendNewCustomer(@RequestBody Customer customer) {
        useCase.createNewCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
