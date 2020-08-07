package posting.containers.buckets;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

public class BucketPostingEntry {
    private BucketInstance associatedBucket;
    private LocalDate transactionDate;
    private LocalDate postingDate;
    private BigDecimal balance;
}
