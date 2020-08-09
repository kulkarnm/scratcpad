package posting.containers.buckets.fee;

import model.buckets.Bucket;
import org.joda.time.LocalDate;
import posting.containers.fees.AccountFeeInstance;

import java.math.BigDecimal;
import java.util.List;

public class AccountFeeBucketInstance {
    private String accountFeeBucketInstanceId;
    private Bucket parentBucket;
    private AccountFeeInstance accountFeeInstance;
    private LocalDate bucketInstanceStartDate;
    private LocalDate bucketInstanceEndDate;
    private List<FeeBucketPostingEntry> feePostingEntries;
}
