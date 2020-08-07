package model.fees;

import model.buckets.BucketCode;
import model.transaction.TransactionCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//at present not to be used
@Document
public class FeeBucketGroup {
    @Id
    private String bucketGroupCode;
    private String name;
    private FeeBucketGroupClass feeBucketGroupClass;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;
}
