package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.buckets.fee.AccountFeeBucketInstance;
import posting.containers.fees.AccountFeeInstance;

public interface AccountFeeInstanceRepository extends CrudRepository<AccountFeeInstance,String> {
}
