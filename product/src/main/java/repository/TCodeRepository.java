package repository;

import model.plan.Plan;
import model.transaction.TCode;
import org.springframework.data.repository.CrudRepository;

public interface TCodeRepository extends CrudRepository<TCode,String> {
}
