package posting.containers.buckets.fee;

import org.joda.time.LocalDate;
import posting.containers.buckets.plan.AccountPlanBucketInstance;

import java.math.BigDecimal;

public class FeeBucketPostingEntry {
    private String feeBucketPostingEntryId;
    private AccountFeeBucketInstance associatedBucket;
    private LocalDate transactionDate;
    private LocalDate postingDate;
    private BigDecimal balance;
}
