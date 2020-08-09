package posting.containers.account;

import model.product.Product;
import org.joda.time.LocalDate;
import posting.containers.customer.Customer;
import posting.containers.device.Device;

import java.util.List;

public class AccountAttributes {
    private AccountType accountType;
    private LocalDate accountOpeningDate;
    private LocalDate transferredDate;
    private TotalCreditLimit totalCreditLimit;
    private List<CreditLimitHistoryInstance> creditLimitHistory;
    private ProductBrand productBrand;
    private State state;
    private StateReason stateReason;
    private FraudState fraudState;
    private FraudStateReason fraudStateReason;
    private DelinquencyState delinquencyState;
    private DelinquencyStateReason delinquencyStateReason;
    private CollectionStateReason collectionStateReason;
    private FraudProcessingState fraudProcessingState;
    private CollectionProcessingState collectionProcessingState;
    private Boolean hasInsurance;
    private List<Customer> customerRelationships;
    private List<Device> deviceRelationships;
}
