package posting.containers.account;

import model.product.Product;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.util.List;

public class Account {
    private String accountId;
    private String masterAccountNumber;
    private LocalDate accountOpenDate;
    private Product associatedProduct;
    private String memberId;
    private List<PlanInstance> planInstanceList;
    private BigDecimal approvedCreditLimit;
    private BigDecimal availableBalance;

} 
