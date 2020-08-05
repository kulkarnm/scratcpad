package posting.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoRepositories(mongoTemplateRef ="postingMongoTemplate", basePackages = {"respository.*"})
public class PostingMongoConfiguration {
        @Bean //(name="subscriberMongoTemplate")
        @Qualifier("postingMongoTemplate")
        public MongoTemplate postingMongoTemplate(@Qualifier("postingMongoDbFactory") MongoDbFactory factory,@Qualifier("postingMappingMongoConverter") MappingMongoConverter mappingMongoConverter) {
            System.out.println("###INside postingMongoDbFactory creation " + factory.getDb().getName());
            MongoTemplate mongoTemplate = new MongoTemplate(factory,mappingMongoConverter);
            MappingMongoConverter mmc = (MappingMongoConverter)mongoTemplate.getConverter();
            mmc.setCustomConversions(postingCustomConversions());
            mmc.afterPropertiesSet();
            return mongoTemplate;
        }

        @Bean //(name="SubscriberMongo")
        @Qualifier("postingMongo")
        public MongoClient postingMongo(@Qualifier("postingMongoClientURI") MongoClientURI mongoClientURI) throws UnknownHostException {
            System.out.println("###INside MOngoClient creation");
            return new MongoClient(mongoClientURI);
        }

        @Bean //(name="SubscriberMongoClientURI")
        @Qualifier("postingMongoClientURI")
        public MongoClientURI postingMongoClientURI(@Value("${view.db.posting.host}") String host, @Value("${view.db.posting.port}") int port,
                                                    @Value("${view.db.posting.name}") String dbName,
                                                    @Value("${affaince.db.username}") String username,
                                                    @Value("${affaince.db.password}") String password) {
            final MongoClientOptions options = MongoClientOptions.builder()
                    .threadsAllowedToBlockForConnectionMultiplier(2)
                    .connectionsPerHost(10)
                    .connectTimeout(15000)
                    .maxWaitTime(15000)
                    .socketTimeout(15000)
                    .heartbeatConnectTimeout(5000)
                    .minHeartbeatFrequency(1000)
                    .build();

            return new MongoClientURI("mongodb://" /*+ username + ":" + password + "@" */
                    + host
                    + ":"
                    + port
                    + "/" +
                    dbName,MongoClientOptions.builder(options));
        }

        @Bean //(name="SubscriberMongoDbFactory")
        @Qualifier("postingMongoDbFactory")
        public MongoDbFactory postingMongoDbFactory(@Value("${view.db.posting.host}") String host, @Value("${view.db.posting.port}") int port,
                                                    @Value("${view.db.posting.name}") String dbName) throws UnknownHostException {
            System.out.println("###INside mongoDbFactory creation");
            return new SimpleMongoDbFactory(new MongoClient(new ServerAddress(host, port)), dbName);
        }

        @Bean //(name="SubscriberMappingMongoConverter")
        @Qualifier("postingMappingMongoConverter")
        public MappingMongoConverter postingMappingMongoConverter(@Qualifier("postingMongoDbFactory")MongoDbFactory mongoDbFactory,
                                                                  @Qualifier("postingCustomConversions") CustomConversions customConversions) throws Exception {
            MongoMappingContext mappingContext = new MongoMappingContext();
            DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
            MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mappingContext);
            converter.setCustomConversions(postingCustomConversions());
            converter.afterPropertiesSet();
            return converter;
        }

        @Bean //(name="SubscriberCustomConversions")
        @Qualifier("postingCustomConversions")
        public CustomConversions postingCustomConversions(){
            List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();
            return new CustomConversions(converters);
        }


} 
