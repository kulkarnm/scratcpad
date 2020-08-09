package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.fees.AccountFeeInstance;
import posting.containers.plan.AccountPlanInstance;

public interface AccountPlanInstanceRepository extends CrudRepository<AccountPlanInstance,String> {
}
