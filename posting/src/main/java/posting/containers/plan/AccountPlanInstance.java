package posting.containers.plan;

import model.plan.Plan;
import org.joda.time.LocalDate;
import posting.containers.account.Account;


public class AccountPlanInstance {
    private Plan parentPlan;
    private Account associatedAccount;
    private LocalDate planInstanceStartDate;
    private LocalDate planInstanceEndDate;
}
