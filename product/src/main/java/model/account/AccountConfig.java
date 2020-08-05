package model.account;


import model.charge.FinanceChargeRule;
import model.fees.ServiceFee;
import model.product.Product;

import java.util.List;

public class AccountConfig {
    private String accountDefinitionId;
    private Product parentProduct;
    private List<ServiceFee> feesOverride;
    //private List<FinanceChargeRule> chargesOverride;
} 
