package repository;

import model.fees.GlobalFeeFragment;
import model.plan.GlobalPlan;
import org.springframework.data.repository.CrudRepository;

public interface GlobalPlanRepository extends CrudRepository<GlobalPlan,String> {
}
