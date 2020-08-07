package model.fees;

import model.buckets.BucketCode;
import model.transaction.TransactionCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class ServiceFee {
    @Id
    private String feeId;
    private String name;
    private FeeClass feeClass;
    private List<FeeBucketGroup> feeBucketGroups;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;
}
