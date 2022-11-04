package br.com.alura.telefonica.kafka.boost.newcustomerservice.application.port.out;

import br.com.alura.telefonica.kafka.boost.newcustomerservice.domain.Customer;

public interface KafkaPortOut {

    void sendCustomerToKafka(String key, String value);

}
