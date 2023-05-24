package br.com.alura.telefonica.kafka.boost.newcustomerservice.application.port.out;

import br.com.alura.telefonica.kafka.boost.common.domain.Customer;

public interface KafkaPortOut {

    void sendCustomerToKafka(String key, Customer value);

}
