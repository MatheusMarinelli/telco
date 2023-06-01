package br.com.alura.telefonica.kafka.boost.newcustomersetupservice.framework.adapter.in.kafka;

import br.com.alura.telefonica.kafka.boost.common.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NewCustomerSetupSubscriber {
    @KafkaListener(topics = "${topic.customer}")
    public void consumeNewCustomer(@Payload Customer customer) {
      log.info("SCHEDULING NEW INSTALLATION FOR CUSTOMER {}",customer);
    }


}
