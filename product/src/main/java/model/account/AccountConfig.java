package model.account;


import model.charge.ChargeCode;
import model.fees.Fee;
import model.interest.InterestRateDefinition;
import model.plan.Plan;
import model.transaction.TCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class AccountConfig {
    @Id
    private String accountDefinitionId;
    private List<TCode> mappedTCodes;
    private List<Plan> mappedPlans;
    private List<Fee> mappedFees;
    private List<ChargeCode> mappedChargeCodes;
    private List<InterestRateDefinition> interestOverride;
}
