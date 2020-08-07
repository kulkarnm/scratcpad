package model.product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BillingCycle {
    @Id
    private String billingCycleId;
    private int numberOfDaysInCycle;
    //no sooner - 10 days
    //no later - 10 days

} 
