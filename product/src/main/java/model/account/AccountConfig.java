package model.account;


import model.fees.Fee;
import model.interest.InterestRateDefinition;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class AccountConfig {
    @Id
    private String accountDefinitionId;
    private List<Fee> feesOverride;
    private List<InterestRateDefinition> interestOverride;
}
