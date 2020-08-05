package model.charge;


import model.buckets.Bucket;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ChargeCode {
    @Id
    private String chargeCodeId;
    private ChargeCodeClass chargeCodeClass;
    private Bucket mappedBucket;
} 
