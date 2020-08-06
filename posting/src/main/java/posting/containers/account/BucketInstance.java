package posting.containers.account;

import model.buckets.Bucket;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.util.List;

public class BucketInstance {
    private Bucket parentBucket;
    private LocalDate planInstanceStartDate;
    private LocalDate planInstanceEndDate;
    private List<BucketPostingEntry> postings;
    private BigDecimal value;

} 
