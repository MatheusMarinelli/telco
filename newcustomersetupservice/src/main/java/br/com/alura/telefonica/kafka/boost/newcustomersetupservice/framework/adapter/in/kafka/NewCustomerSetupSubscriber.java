package br.com.alura.telefonica.kafka.boost.newcustomersetupservice.framework.adapter.in.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NewCustomerSetupSubscriber {



    @KafkaListener(topics = "${topic.customer}")
    public void consumeNewCustomer(String message) {
      log.info("SCHEDULING NEW INSTALLATION FOR CUSTOMER {}",message);
    }


}
