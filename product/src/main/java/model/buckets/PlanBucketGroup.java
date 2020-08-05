package model.buckets;


import model.transaction.TransactionCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//As of now unused
@Document
public class PlanBucketGroup {
    @Id
    private String bucketGroupCode;
    private String name;
    private PlanBucketGroupClass planBucketGroupClass;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;

} 
