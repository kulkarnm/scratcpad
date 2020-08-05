package model.buckets;


import model.charge.ChargeCodeType;
import model.transaction.TransactionCode;

import java.util.List;

public class PlanBucketGroup {
    private String bucketGroupCode;
    private String name;
    private PlanBucketGroupClass planBucketGroupClass;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;

} 
