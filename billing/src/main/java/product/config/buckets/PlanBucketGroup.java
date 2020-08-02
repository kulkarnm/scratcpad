package product.config.buckets;

import product.config.charge.ChargeCodeType;
import product.config.transaction.TCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class PlanBucketGroup {
    @Id
    private String bucketGroupCode;
    private String name;
    private BucketCode bucketCode;
    private List<TCode> mappedTCodes;
    private List<ChargeCodeType> mappedCargeCodes;

} 
