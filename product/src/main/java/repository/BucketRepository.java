package repository;

import model.buckets.Bucket;
import org.springframework.data.repository.CrudRepository;

public interface BucketRepository extends CrudRepository<Bucket, String> {
}
