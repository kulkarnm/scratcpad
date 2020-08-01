package product.config.account;

import product.config.charge.FinanceChargeRule;
import product.config.fees.ServiceFee;
import product.config.product.Product;

import java.util.List;

public class AccountConfig {
    private String accountDefinitionId;
    private Product parentProduct;
    private List<ServiceFee> feesOverride;
    private List<FinanceChargeRule> chargesOverride;
} 
