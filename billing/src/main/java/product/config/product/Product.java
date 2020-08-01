package product.config.product;

import product.config.plan.Plan;
import product.config.fees.ServiceFee;
import java.util.List;

public class Product {
    private String productId;
    private List<Plan> plans;
    private int yearBase;
    private List<ServiceFee> feesApplicable;
    private BillingCycle bIllingCycle;

} 
