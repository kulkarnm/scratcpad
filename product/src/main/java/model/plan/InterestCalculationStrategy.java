package model.plan;

import model.interest.InterestAccrual;
import model.interest.InterestCalculationDateConsideration;

public class InterestCalculationStrategy {
    private String interestCalculationStrategyId;
    private String strategyName;
    //transaction date or posting date
    private InterestCalculationDateConsideration dateConsideration;
    // is grace period applicable for this charge( yes for retail interest, no for cash)
    private boolean isGraceApplicable;
    //is calculated daily or monthly
    private InterestAccrual interestAccrual;

} 
