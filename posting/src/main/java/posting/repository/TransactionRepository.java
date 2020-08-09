package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.transaction.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction,String> {
}
