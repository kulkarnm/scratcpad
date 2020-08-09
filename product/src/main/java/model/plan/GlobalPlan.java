package model.plan;

import model.buckets.BucketCode;
import model.interest.InterestRateDefinition;
import model.transaction.TransactionCode;
import org.springframework.data.annotation.Id;

import java.util.List;

public class GlobalPlan {
    @Id
    private String planId;
    private PlanClass planClass;
    private InterestRateDefinition interestRateDefinition;
    private InterestCalculationStrategy interestCalculationStrategy;
    private List<TransactionCode> mappedTransactionCodes;

} 
