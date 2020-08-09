package repository;

import model.fees.Fee;
import org.springframework.data.repository.CrudRepository;

public interface FeeRepository extends CrudRepository<Fee,String> {
}
