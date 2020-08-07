package model.plan;

import model.interest.InterestAccrualMethod;
import model.interest.InterestCalculationDateConsideration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InterestCalculationStrategy {
    @Id
    private String interestCalculationStrategyId;
    private String strategyName;
    //transaction date or posting date
    private InterestCalculationDateConsideration dateConsideration;
    // is grace period applicable for this charge( yes for retail interest, no for cash)
    private boolean isGraceApplicable;
    //is calculated daily or monthly
    private InterestAccrualMethod interestAccrualMethod;

} 
