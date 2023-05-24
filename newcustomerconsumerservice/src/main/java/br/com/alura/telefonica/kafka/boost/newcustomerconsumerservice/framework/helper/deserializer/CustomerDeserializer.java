package br.com.alura.telefonica.kafka.boost.newcustomerconsumerservice.framework.helper.deserializer;

import br.com.alura.telefonica.kafka.boost.common.domain.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class CustomerDeserializer<T> implements Deserializer<T> {


    @Override
    public T deserialize(String topic, byte[] data) {
        try {
            return (T) new ObjectMapper().readValue(data, Customer.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
