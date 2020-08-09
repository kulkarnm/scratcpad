package repository;

import model.account.AccountConfig;
import org.springframework.data.repository.CrudRepository;

public interface AccountConfigRepository extends CrudRepository<AccountConfig, String> {
}
