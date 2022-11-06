package br.com.alura.telefonica.kafka.boost.newcustomerservice.framework.adapter.out.kafka;

import br.com.alura.telefonica.kafka.boost.newcustomerservice.application.port.out.KafkaPortOut;
import br.com.alura.telefonica.kafka.boost.newcustomerservice.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Slf4j
@Component
public class CustomerPublisher implements KafkaPortOut {

    @Value("${topic.customer}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, Customer> template;

    @Override
    public void sendCustomerToKafka(String key, Customer value) {
        template.send(topic,key,value).addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onFailure(Throwable ex) {
                log.error("ERROR TO SEND MESSAGE TO TOPIC!");
            }

            @Override
            public void onSuccess(SendResult<String, Customer> result) {
                log.info("MESSAGE SENT SUCCESSFULLY TO PARTITION {}",result.getRecordMetadata().partition());
            }
        });
    }

}
