package product.config.account;

import product.config.charge.FinanceChargeRule;
import product.config.fees.ServiceFee;
import product.config.product.Product;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class AccountConfig {
    @Id
    private String accountDefinitionId;
    private Product parentProduct;
    private List<ServiceFee> feesOverride;
    private List<FinanceChargeRule> chargesOverride;
} 
