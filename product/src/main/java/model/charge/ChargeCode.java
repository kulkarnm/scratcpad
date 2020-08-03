package model.charge;


import model.buckets.BucketCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ChargeCode {
    @Id
    private String chargeCodeId;
    private ChargeCodeType chargeCodeType;
    private List<BucketCode> mappedBucketCodes;
} 
