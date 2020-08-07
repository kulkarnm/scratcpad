package posting.containers.account;

import org.joda.time.LocalDate;
import posting.containers.transaction.CurrencyCode;

import java.math.BigDecimal;

public class CreditLimitHistoryInstance {
    private BigDecimal amount;
    private CurrencyCode currencyCode;
    private LocalDate effectiveDate;
} 
