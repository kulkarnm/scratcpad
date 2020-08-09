package model.plan;

import model.buckets.BucketCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class PlanClass {
    @Id
    private String planClassId;
    private PlanClassType planClassType;
    private List<BucketCode> bucketCodes;
} 
