package posting.processor;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import posting.containers.transaction.Transaction;
import posting.events.TransactionEvent;

@Component
public class TransactionConverter {

    public TransactionEvent convertTransaction(Transaction transaction){
        return null;
    }
}
