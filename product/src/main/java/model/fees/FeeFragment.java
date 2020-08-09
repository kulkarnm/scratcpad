package model.fees;

import model.buckets.BucketCode;
import model.interest.InterestRateDefinition;
import model.plan.InterestCalculationStrategy;
import model.transaction.TransactionCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class FeeFragment {
    @Id
    private String feeFragmentId;
    private GlobalFeeFragment overriddenFeeFragment;
    private String name;
    private FeeFragmentClass feeFragmentClass;
    private InterestRateDefinition interestRateDefinition;
    private InterestCalculationStrategy interestCalculationStrategy;
    private List<TransactionCode> mappedTransactionCodes;
    private Fee parentFeeContainer;
}
