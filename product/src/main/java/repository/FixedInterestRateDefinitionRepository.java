package repository;

import model.fees.Fee;
import model.interest.FixedInterestRateDefinition;
import org.springframework.data.repository.CrudRepository;

public interface FixedInterestRateDefinitionRepository extends CrudRepository<FixedInterestRateDefinition,String> {
}
