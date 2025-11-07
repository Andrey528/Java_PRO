package lesson2;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class KafkaProducerExample {
    private static final String TOPIC = "test-topic";
    private static final String[] FRUITS = {"apple", "banana", "cherry", "date", "elderberry"};

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

//    @PostConstruct
//    public void sendMessages() {
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            String fruit = FRUITS[random.nextInt(FRUITS.length)];
//            kafkaTemplate.send(TOPIC, fruit);
//            System.out.println("Sent message: " + fruit);
//        }
//    }
}
