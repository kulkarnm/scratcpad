package model.fees;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ServiceFee {
    @Id
    private String feeId;
    private List<FeeBucketGroup> feeBucketGroups;
}
