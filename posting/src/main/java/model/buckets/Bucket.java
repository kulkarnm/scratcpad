package model.buckets;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bucket {
    @Id
    private String bucketId;
    private BucketCategory bucketCategory;
    private BucketCode bucketCode;
}
