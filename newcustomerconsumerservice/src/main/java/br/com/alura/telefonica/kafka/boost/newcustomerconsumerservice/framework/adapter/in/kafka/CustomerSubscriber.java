package br.com.alura.telefonica.kafka.boost.newcustomerconsumerservice.framework.adapter.in.kafka;

import br.com.alura.telefonica.kafka.boost.newcustomerconsumerservice.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerSubscriber {

    @KafkaListener(topics = "${topic.customer}")
    public void consumeCustomer(@Payload Customer message) {
        log.info("MESSAGE CONSUMED {}",message);
    }

}
