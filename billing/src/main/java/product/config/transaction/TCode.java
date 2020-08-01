package product.config.transaction;

import java.util.List;

public class TCode {
    private String tCode;
    private TCode parent;
    private List<TCode> children;
    private TransactionType transactionType;
    private TransactionMethod transactionMethod;
    private TransactionCurrency transactionCurrency;

}
