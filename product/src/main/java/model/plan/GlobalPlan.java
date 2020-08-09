package model.plan;

import model.interest.InterestRateDefinition;
import model.transaction.TCode;
import org.springframework.data.annotation.Id;

import java.util.List;

public class GlobalPlan {
    @Id
    private String planId;
    private PlanClass planClass;
    private InterestRateDefinition interestRateDefinition;
    private InterestCalculationStrategy interestCalculationStrategy;
    private List<TCode> mappedTCodes;

} 
