package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.account.Account;
import posting.containers.customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer,String> {
}
