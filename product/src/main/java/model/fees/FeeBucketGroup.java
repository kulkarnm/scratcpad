package model.fees;

import model.buckets.BucketCode;
import model.charge.ChargeCodeType;
import model.transaction.TransactionCode;

import java.util.List;
public class FeeBucketGroup {
    private String bucketGroupCode;
    private String name;
    private FeeBucketGroupClass feeBucketGroupClass;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;
}
