package model.plan;


import model.buckets.BucketCode;
import model.buckets.PlanBucketGroup;
import model.interest.InterestRateDefinition;
import model.transaction.TransactionCode;

import java.util.List;

//equivalent to Plans in Vision+
public class Plan {
    private String planId;
    private PlanClass planClass;
    private InterestRateDefinition interestRateDefinition;
    private List<PlanBucketGroup> planBucketGroups;
    private InterestCalculationStrategy interestCalculationStrategy;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;

} 
