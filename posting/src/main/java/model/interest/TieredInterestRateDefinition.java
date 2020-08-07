package model.interest;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document
public class TieredInterestRateDefinition extends InterestRateDefinition {
    private Map<BalanceRange, Double> tierWiseRateValue;
}
