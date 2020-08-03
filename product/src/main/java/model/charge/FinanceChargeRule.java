package model.charge;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FinanceChargeRule {
    @Id
    private String chargeRuleId;
    // is interest calculation from transaciton date or from posting Date
    private boolean isApplicableOnTransactionDate;
    // is grace period applicable for this charge( yes for retail interest, no for cash)
    private boolean isGraceApplicable;
    //is calculated daily or monthly
    private boolean isApplicableMonthly;
}
