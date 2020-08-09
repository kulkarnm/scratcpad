package model.interest;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FixedInterestRateDefinition")
//@TypeAlias("FixedInterestRateDefinition")
public class FixedInterestRateDefinition extends InterestRateDefinition {
    private double interestRateValue;
} 
