package posting.containers.transaction;

import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document
public class Transaction {
    @Id
    private String transactionRefNo;
    private TransactionCode transactionCode;
    private TransactionType transactionType;
    private String accountNumber;
    private TransactionMethod transactionMethod;
    private RequestType requestType;
    private BigDecimal transactionAmount;
    private CurrencyCode transactionCurrencyCode;
    private BigDecimal billingAmount;
    private CurrencyCode billingCurrencyCode;
    private BigDecimal billingConversionRate;
    private LocalDate transactionDateAndTime;
    private LocalDate postingDateAndTime;

}
