package model.interest;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
@Document(collection = "TieredInterestRateDefinition")
//@TypeAlias("TieredInterestRateDefinition")
public class TieredInterestRateDefinition extends InterestRateDefinition {
    private Map<BalanceRange, Double> tierWiseRateValue;
}
