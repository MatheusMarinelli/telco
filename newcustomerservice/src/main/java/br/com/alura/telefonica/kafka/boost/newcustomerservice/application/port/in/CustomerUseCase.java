package br.com.alura.telefonica.kafka.boost.newcustomerservice.application.port.in;

import br.com.alura.telefonica.kafka.boost.newcustomerservice.domain.Customer;

public interface CustomerUseCase {

    void createNewCustomer(Customer customer);

}
