package model.plan;


import model.buckets.PlanBucketGroup;
import model.charge.FinanceChargeRule;

import java.util.List;

//equivalent to Plans in Vision+
public class Plan {
    private String planId;
    private PlanClass planClass;
    private FinanceChargeRule applicableChargeRule;
    private List<PlanBucketGroup> allowedBuckets;
} 
