package model.account;


import model.fees.ServiceFee;
import model.product.Product;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class AccountConfig {
    @Id
    private String accountDefinitionId;
    private Product parentProduct;
    private List<ServiceFee> feesOverride;
}
