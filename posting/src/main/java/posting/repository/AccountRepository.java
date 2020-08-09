package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.account.Account;

public interface AccountRepository extends CrudRepository<Account,String> {
}
