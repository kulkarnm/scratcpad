package product.config.charge;

import product.config.interest.InterestRate;
import product.config.interest.InterestRateType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class FinanceChargeRule {
    @Id
    private String chargeRuleId;
    private InterestRateType interestRateType;
    private List<InterestRate> applicableInterestRates;
    // is interest calculation from transaciton date or from posting Date
    private boolean isApplicableOnTransactionDate;
    // is grace period applicable for this charge( yes for retail interest, no for cash)
    private boolean isGraceApplicable;
    //is calculated daily or monthly
    private boolean isApplicableMonthly;
}
