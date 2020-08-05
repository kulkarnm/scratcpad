package model.product;


import model.fees.ServiceFee;
import model.plan.Plan;

import java.util.List;

public class Product {
    private String productId;
    private List<Plan> plans;
    private int yearBase;
    private List<ServiceFee> feesApplicable;
    //private BillingCycle billingCycle;
}
