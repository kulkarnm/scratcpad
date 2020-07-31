package com.billing.config.buckets;

import com.billing.config.charge.ChargeCodeType;
import com.billing.config.transaction.TCode;

import java.util.List;

public class PlanBucketGroup {
    private String bucketGroupCode;
    private String name;
    private BucketCode bucketCode;
    private List<TCode> mappedTCodes;
    private List<ChargeCodeType> mappedCargeCodes;

} 
