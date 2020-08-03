package model.account;


import model.charge.FinanceChargeRule;
import model.fees.ServiceFee;
import model.product.Product;

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
