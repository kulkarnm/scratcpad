package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.account.Account;
import posting.containers.buckets.fee.AccountFeeBucketInstance;

public interface AccountFeeBucketInstanceRepository extends CrudRepository<AccountFeeBucketInstance,String> {
}
