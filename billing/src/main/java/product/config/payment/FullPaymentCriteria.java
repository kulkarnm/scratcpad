package product.config.payment;

import product.config.product.BillingCycle;

public class FullPaymentCriteria {
    private String fullPaymentCriteriaId;
    private BillingCycle billingCycle;
    private int numberOfDaysFromPaymentDueDate;
    private boolean includeFinancialCharges;

} 
