package com.billing.config.account;

import com.billing.config.charge.FinanceChargeRule;
import com.billing.config.fees.ServiceFee;
import com.billing.config.product.Product;

import java.util.List;

public class AccountConfig {
    private String accountDefinitionId;
    private Product parentProduct;
    private List<ServiceFee> feesOverride;
    private List<FinanceChargeRule> chargesOverride;
} 
