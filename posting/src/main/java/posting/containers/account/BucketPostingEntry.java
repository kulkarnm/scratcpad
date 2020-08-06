package posting.containers.account;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

public class BucketPostingEntry {
    private LocalDate transactionDate;
    private LocalDate postingDate;
    private BigDecimal balance;
}
