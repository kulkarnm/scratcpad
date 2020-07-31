package com.billing.config.product;

import com.billing.config.plan.Plan;
import com.billing.config.fees.ServiceFee;
import java.util.List;

public class Product {
    private String productId;
    private List<Plan> plans;
    private int yearBase;
    private List<ServiceFee> feesApplicable;
    private BillingCycle bIllingCycle;

} 
