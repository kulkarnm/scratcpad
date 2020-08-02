package posting.processor;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Value;

public class TransactionStreamProcessor {

    @Value("${kafka.topic.even-output}")
    private String evenOutput;

    public void process(KStream<String, Long> stream){
        stream
                .filter((k, v) -> v % 2 == 0)
                .mapValues(v -> {
                    System.out.println("Squaring Even :: " + v);
                    return v * v;
                })
                .to(evenOutput);
    }
} 
