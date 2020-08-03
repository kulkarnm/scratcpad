package model.plan;


import model.buckets.PlanBucketGroup;
import model.interest.InterestRateDefinition;

import java.util.List;

//equivalent to Plans in Vision+
public class Plan {
    private String planId;
    private PlanClass planClass;
    private InterestRateDefinition interestRateDefinition;
    private List<PlanBucketGroup> planBucketGroups;
    private InterestCalculationStrategy interestCalculationStrategy;
} 
