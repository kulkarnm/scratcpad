package product.config.fees;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceFee {
    @Id
    private String feeId;
    private FeeType feeType;
    private double feeValue;
}
