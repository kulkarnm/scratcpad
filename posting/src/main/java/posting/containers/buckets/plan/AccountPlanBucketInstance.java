package posting.containers.buckets.plan;

import model.buckets.Bucket;
import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import posting.containers.plan.AccountPlanInstance;

import java.util.List;
@Document
public class AccountPlanBucketInstance {
    @Id
    private String accountPlanBucketInstanceId;
    private Bucket parentBucket;
    private AccountPlanInstance associatedPlan;
    private LocalDate bucketInstanceStartDate;
    private LocalDate bucketInstanceEndDate;
    private List<PlanBucketPostingEntry> transactionPostingEntries;

} 
