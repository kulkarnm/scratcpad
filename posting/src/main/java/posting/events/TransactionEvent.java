package posting.events;

import model.transaction.TCode;
import org.joda.time.LocalDate;
import posting.containers.transaction.CurrencyCode;

import java.math.BigDecimal;

public class TransactionEvent {
    private TCode mappedTCode;
    private String accountNumber;
    private BigDecimal transactionAmount;
    private CurrencyCode transactionCurrencyCode;
    private LocalDate transactionDateAndTime;
    private LocalDate postingDateAndTime;

} 
