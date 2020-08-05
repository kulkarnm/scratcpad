package model.transaction;

import model.buckets.PlanBucketGroup;
import model.charge.ChargeCode;
import model.plan.Plan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class TransactionCode {
    @Id
    private String tCode;
    private TransactionCode parent;
    private List<TransactionCode> children;
    private Plan mappedPlan;
    private List<KeyValueMap> attributes;
    private List<ChargeCode> mappedChargeCodes;

}
