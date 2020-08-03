package model.product;

import product.config.fees.ServiceFee;
import product.config.plan.Plan;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Product {
    @Id
    private String productId;
    private List<Plan> plans;
    private int yearBase;
    private List<ServiceFee> feesApplicable;
    private BillingCycle bIllingCycle;

} 
