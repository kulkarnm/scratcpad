package posting.containers.account;

import model.account.AccountConfig;
import model.product.Product;
import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document
public class Account {
    @Id
    private String accountId;
    private AccountAttributes accountAttributes;
    private AccountConfig configOverrides;
}
