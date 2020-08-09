package repository;

import model.interest.FixedInterestRateDefinition;
import model.interest.TieredInterestRateDefinition;
import org.springframework.data.repository.CrudRepository;

public interface TieredInterestRateDefinitionRepository extends CrudRepository<TieredInterestRateDefinition,String> {
}
