package model.fees;

import model.buckets.BucketCode;
import model.charge.ChargeCodeType;
import model.transaction.TransactionCode;

import javax.persistence.Entity;
import java.util.List;
@Entity
public class FeeBucketGroup {
    private String bucketGroupCode;
    private String name;
    private FeeBucketGroupClass feeBucketGroupClass;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;
}
