package transaction.listener;

import org.springframework.kafka.annotation.KafkaListener;
import transaction.event.TransactionEvent;

public class TransactionEventListener {

    @KafkaListener(topics = "${kafka.topic.transaction-output}")
    public void consume(TransactionEvent event)  {

    }
} 
