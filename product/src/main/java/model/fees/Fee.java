package model.fees;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class Fee {
    @Id
    private String feeId;
    private String name;
    private List<FeeFragment> feeFragments;
}
