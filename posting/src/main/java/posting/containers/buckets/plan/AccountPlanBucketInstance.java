package posting.containers.buckets.plan;

import model.buckets.Bucket;
import org.joda.time.LocalDate;
import posting.containers.plan.AccountPlanInstance;

import java.util.List;

public class AccountPlanBucketInstance {
    private String accountPlanBucketInstanceId;
    private Bucket parentBucket;
    private AccountPlanInstance associatedPlan;
    private LocalDate bucketInstanceStartDate;
    private LocalDate bucketInstanceEndDate;
    private List<PlanBucketPostingEntry> transactionPostingEntries;

} 
