package billing.processor;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InterestPostingProcessor {
    @Value("${kafka.topic.even-output}")
    private String evenOutput;

    public void process(KStream<String, Long> stream){

    }

} 
