package posting.containers.buckets.plan;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

public class PlanBucketPostingEntry {
    private AccountPlanBucketInstance associatedBucket;
    private LocalDate transactionDate;
    private LocalDate postingDate;
    private BigDecimal balance;
}
