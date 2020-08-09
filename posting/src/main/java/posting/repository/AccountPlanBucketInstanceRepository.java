package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.buckets.fee.AccountFeeBucketInstance;
import posting.containers.buckets.plan.AccountPlanBucketInstance;

public interface AccountPlanBucketInstanceRepository extends CrudRepository<AccountPlanBucketInstance,String> {
}
