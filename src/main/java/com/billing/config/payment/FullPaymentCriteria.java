package com.billing.config.payment;

import com.billing.config.product.BillingCycle;

public class FullPaymentCriteria {
    private String fullPaymentCriteriaId;
    private BillingCycle billingCycle;
    private int numberOfDaysFromPaymentDueDate;
    private boolean includeFinancialCharges;

} 
