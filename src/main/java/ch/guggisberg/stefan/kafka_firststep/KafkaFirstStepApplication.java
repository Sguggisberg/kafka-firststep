package ch.guggisberg.stefan.kafka_firststep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaFirstStepApplication{


    public static void main(String[] args) {
        SpringApplication.run(KafkaFirstStepApplication.class, args);
    }
}
