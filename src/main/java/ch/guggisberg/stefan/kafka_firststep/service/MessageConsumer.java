package ch.guggisberg.stefan.kafka_firststep.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static ch.guggisberg.stefan.kafka_firststep.configuration.KafkaConfig.TOPIC;

@Component
public class MessageConsumer {

    @KafkaListener(topics = TOPIC, groupId = "my-group-id")
    public void listen(String message) {
        System.out.println(" ******************** Received message: " + message);
    }

}
