package model.payment;


import model.product.BillingCycle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FullPaymentCriteria {
    @Id
    private String fullPaymentCriteriaId;
    private BillingCycle billingCycle;
    private int numberOfDaysFromPaymentDueDate;
    private boolean includeFinancialCharges;

} 
