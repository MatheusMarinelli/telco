package br.com.alura.telefonica.kafka.boost.common.helper.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class CommonDeserialize<T> implements Deserializer<T> {

    private final Class<T> type;

    public CommonDeserialize(Class<T> type) {
        this.type = type;
    }

    @Override
    public T deserialize(String topic, byte[] data) {
        try {
            return new ObjectMapper().readValue(data, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
