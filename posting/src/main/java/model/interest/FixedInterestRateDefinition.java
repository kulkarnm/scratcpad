package model.interest;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FixedInterestRateDefinition extends InterestRateDefinition {
    private double interestRateValue;
} 
