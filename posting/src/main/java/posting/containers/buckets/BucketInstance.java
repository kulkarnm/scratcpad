package posting.containers.buckets;

import model.buckets.Bucket;
import org.joda.time.LocalDate;
import posting.containers.plan.AccountPlanInstance;

import java.math.BigDecimal;
import java.util.List;

public class BucketInstance {
    private Bucket parentBucket;
    private AccountPlanInstance associatedPlan;
    private LocalDate bucketInstanceStartDate;
    private LocalDate bucketInstanceEndDate;
    private BigDecimal value;

} 
