package model.buckets;


import model.charge.ChargeCodeType;
import model.transaction.TransactionCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class PlanBucketGroup {
    @Id
    private String bucketGroupCode;
    private String name;
    private PlanBucketGroupClass planBucketGroupClass;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;

} 
