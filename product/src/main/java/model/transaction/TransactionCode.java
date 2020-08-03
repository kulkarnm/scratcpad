package model.transaction;

import model.buckets.PlanBucketGroup;
import model.charge.ChargeCode;

import java.util.List;

public class TransactionCode {
    private String tCode;
    private TransactionCode parent;
    private TransactionType transactionType;
    private List<TransactionCode> children;
    private PlanBucketGroup parentPlanBucketGroup;
    //TODO: to be constrained
    private List<KeyValueMap> attributes;
/*
    private TransactionType transactionType;
    private TransactionMethod transactionMethod;
    private TransactionCurrency transactionCurrency;
*/
    private List<ChargeCode> mappedChargeCodes;

}
