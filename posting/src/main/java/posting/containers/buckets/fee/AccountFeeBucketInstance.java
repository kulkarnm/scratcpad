package posting.containers.buckets.fee;

import model.buckets.Bucket;
import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import posting.containers.fees.AccountFeeInstance;

import java.math.BigDecimal;
import java.util.List;
@Document
public class AccountFeeBucketInstance {
    @Id
    private String accountFeeBucketInstanceId;
    private Bucket parentBucket;
    private AccountFeeInstance accountFeeInstance;
    private LocalDate bucketInstanceStartDate;
    private LocalDate bucketInstanceEndDate;
    private List<FeeBucketPostingEntry> feePostingEntries;
}
