package br.com.alura.telefonica.kafka.boost.common.helper.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

public class CommonSerializer<T> implements Serializer<T> {

    @Override
    public byte[] serialize(String topic, Object data) {
        try {
            return new ObjectMapper().writeValueAsBytes(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
