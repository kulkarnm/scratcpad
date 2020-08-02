package product.config.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BillingCycle {
    @Id
    private String billingCycleId;
    private int numberOfDaysInCycle;

} 
