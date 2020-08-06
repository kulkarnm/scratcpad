package posting.containers.account;

import model.plan.Plan;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.util.List;

public class PlanInstance {
    private Plan parentPlan;
    private LocalDate planInstanceStartDate;
    private LocalDate planInstanceEndDate;
    private List<BucketInstance> buckets;
}
