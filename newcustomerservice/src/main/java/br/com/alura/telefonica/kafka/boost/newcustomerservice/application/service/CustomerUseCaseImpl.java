package br.com.alura.telefonica.kafka.boost.newcustomerservice.application.service;

import br.com.alura.telefonica.kafka.boost.newcustomerservice.application.port.in.CustomerUseCase;
import br.com.alura.telefonica.kafka.boost.newcustomerservice.application.port.out.KafkaPortOut;
import br.com.alura.telefonica.kafka.boost.newcustomerservice.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerUseCaseImpl implements CustomerUseCase {

    @Autowired
    private KafkaPortOut portOut;

    @Override
    public void createNewCustomer(Customer customer) {
        portOut.sendCustomerToKafka(customer.getEmail(), customer);
    }

}
