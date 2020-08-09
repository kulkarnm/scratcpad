package model.product;


import model.fees.Fee;
import model.plan.Plan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class Product {
    @Id
    private String productId;
    private String productName;
    private List<Plan> plans;
    private int yearBase;
    private List<Fee> feesApplicable;
    //private BillingCycle billingCycle;
}
