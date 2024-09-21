package ch.guggisberg.stefan.kafka_firststep.service;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static ch.guggisberg.stefan.kafka_firststep.configuration.KafkaConfig.TOPIC;

@Service
@AllArgsConstructor
public class KafkaProducerService {

   private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
