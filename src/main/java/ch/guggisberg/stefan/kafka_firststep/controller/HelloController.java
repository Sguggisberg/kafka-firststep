package ch.guggisberg.stefan.kafka_firststep.controller;

import ch.guggisberg.stefan.kafka_firststep.service.KafkaProducerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

    private KafkaProducerService kafkaProducerService;

    @GetMapping("/send")
    public String getMessage(@RequestParam("message") String message) {
        kafkaProducerService.send(message);
        return "Message sent: " + message;
    }
}
