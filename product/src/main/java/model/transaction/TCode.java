package model.transaction;

import model.charge.ChargeCode;
import model.plan.PlanClass;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class TCode {
    @Id
    private String tCode;
    private TransactionType transactionType;
    private TCode parent;
    private List<TCode> children;
    private PlanClass mappedPlanClass;
    private List<KeyValueMap> attributes;
    private List<ChargeCode> mappedChargeCodes;

}
