package ch.guggisberg.stefan.kafka_firststep.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafKaTopicListeners {

    @KafkaListener(topics = {"topic-name"}, groupId = "my-group-id")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}
