package lesson2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerExample {

    private static final String TOPIC = "test-topic";

    @KafkaListener(topics = TOPIC, groupId = "test-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
