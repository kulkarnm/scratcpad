package model.plan;

import product.config.buckets.PlanBucketGroup;
import product.config.charge.FinanceChargeRule;

import java.util.List;

//equivalent to Plans in Vision+
public class Plan {
    private String planId;
    private PlanClass planClass;
    private FinanceChargeRule applicableChargeRule;
    private List<PlanBucketGroup> allowedBuckets;
} 
