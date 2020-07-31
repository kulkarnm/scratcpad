package com.billing.config.plan;

import com.billing.config.charge.FinanceChargeRule;
import com.billing.config.buckets.PlanBucketGroup;

import java.util.List;

//equivalent to Plans in Vision+
public class Plan {
    private String planId;
    private PlanClass planClass;
    private FinanceChargeRule applicableChargeRule;
    private List<PlanBucketGroup> allowedBuckets;
} 
