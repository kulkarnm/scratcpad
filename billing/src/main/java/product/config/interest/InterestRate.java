package product.config.interest;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class InterestRate {
    @Id
    private String rateId;
    private double minBalance;
    private double maxBalance;
    private double applicableRateValue;
    private LocalDate startDate;
    private LocalDate endDate;


} 
