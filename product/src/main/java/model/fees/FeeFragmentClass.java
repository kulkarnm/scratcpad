package model.fees;

import model.buckets.BucketCode;
import model.interest.InterestRateDefinition;
import model.plan.InterestCalculationStrategy;

import java.util.List;

public class FeeFragmentClass {
    private String feeFragmentClassId;
    private FeeFragmentClassType feeFragmentClassType;
    private List<BucketCode> bucketCodes;
}
