package model.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BillingCycle {
    @Id
    private String billingCycleId;
    private int numberOfDaysInCycle;
    //no sooner - 10 days
    //no later - 10 days

} 
