package posting.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import posting.events.TransactionEvent;

public class MessageProducer {
    @Autowired
    private KafkaTemplate<String, TransactionEvent> kafkaTemplate;

    public void produce(TransactionEvent event) {
        this.kafkaTemplate.sendDefault(event);
    }
} 
