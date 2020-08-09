package posting.containers.fees;

import model.fees.Fee;
import model.fees.FeeFragment;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class AccountFeeInstance {
    @Id
    private String accountFeeInstanceId;
    private Fee parentFee;
    private List<FeeFragment> feeFragments;

} 
