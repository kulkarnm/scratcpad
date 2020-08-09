package model.interest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "InterestRateDefinition")
public class InterestRateDefinition {
    @Id
    private String interestRateId;
    private RateClass type;
    private LocalDate startDate;
    private LocalDate endDate;

}
