package model.fees;

import model.buckets.BucketCode;
import model.interest.InterestRateDefinition;
import model.plan.InterestCalculationStrategy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class FeeFragmentClass {
    @Id
    private String feeFragmentClassId;
    private FeeFragmentClassType feeFragmentClassType;
    private List<BucketCode> bucketCodes;
}
