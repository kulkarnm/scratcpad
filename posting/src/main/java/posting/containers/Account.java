package posting.containers;

import model.account.AccountConfig;
import model.product.Product;

import java.util.List;

public class Account {
    private String accountId;
    private PlanBucketGroup bucketGroup;
    private AccountConfig accountConfig;
    private List<SubAccount> mappedSubAccounts;

}
