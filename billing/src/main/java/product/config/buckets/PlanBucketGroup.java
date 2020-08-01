package product.config.buckets;

import product.config.charge.ChargeCodeType;
import product.config.transaction.TCode;

import java.util.List;

public class PlanBucketGroup {
    private String bucketGroupCode;
    private String name;
    private BucketCode bucketCode;
    private List<TCode> mappedTCodes;
    private List<ChargeCodeType> mappedCargeCodes;

} 
