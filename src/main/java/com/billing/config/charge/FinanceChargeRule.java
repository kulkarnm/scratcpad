package com.billing.config.charge;

import com.billing.config.interest.InterestRate;
import com.billing.config.interest.InterestRateType;

import java.util.List;

public class FinanceChargeRule {
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
