package model.interest;

import java.util.Map;

public class TieredInterestRateDefinition extends InterestRateDefinition {
    private Map<BalanceRange, Double> tierWiseRateValue;
}
