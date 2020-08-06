package model.plan;


import model.buckets.BucketCode;
import model.buckets.PlanBucketGroup;
import model.interest.InterestRateDefinition;
import model.transaction.TransactionCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//equivalent to Plans in Vision+
@Document
public class Plan {
    @Id
    private String planId;
    private PlanClass planClass;
    private InterestRateDefinition interestRateDefinition;
    private InterestCalculationStrategy interestCalculationStrategy;
    private List<BucketCode> bucketCodes;
    private List<TransactionCode> mappedTransactionCodes;

} 
