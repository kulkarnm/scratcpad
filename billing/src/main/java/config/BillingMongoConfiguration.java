package config;

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
@EnableMongoRepositories(mongoTemplateRef ="billingMongoTemplate", basePackages = {"respository.*"})
public class BillingMongoConfiguration {
        @Bean //(name="subscriberMongoTemplate")
        @Qualifier("billingMongoTemplate")
        public MongoTemplate billingMongoTemplate(@Qualifier("billingMongoDbFactory") MongoDbFactory factory,@Qualifier("billingMappingMongoConverter") MappingMongoConverter mappingMongoConverter) {
            System.out.println("###INside billingMongoDbFactory creation " + factory.getDb().getName());
            MongoTemplate mongoTemplate = new MongoTemplate(factory,mappingMongoConverter);
            MappingMongoConverter mmc = (MappingMongoConverter)mongoTemplate.getConverter();
            mmc.setCustomConversions(billingCustomConversions());
            mmc.afterPropertiesSet();
            return mongoTemplate;
        }

        @Bean //(name="SubscriberMongo")
        @Qualifier("billingMongo")
        public MongoClient billingMongo(@Qualifier("billingMongoClientURI") MongoClientURI mongoClientURI) throws UnknownHostException {
            System.out.println("###INside MOngoClient creation");
            return new MongoClient(mongoClientURI);
        }

        @Bean //(name="SubscriberMongoClientURI")
        @Qualifier("billingMongoClientURI")
        public MongoClientURI billingMongoClientURI(@Value("${view.db.billing.host}") String host, @Value("${view.db.billing.port}") int port,
                                                    @Value("${view.db.billing.name}") String dbName,
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
        @Qualifier("billingMongoDbFactory")
        public MongoDbFactory billingMongoDbFactory(@Value("${view.db.billing.host}") String host, @Value("${view.db.billing.port}") int port,
                                                    @Value("${view.db.billing.name}") String dbName) throws UnknownHostException {
            System.out.println("###INside mongoDbFactory creation");
            return new SimpleMongoDbFactory(new MongoClient(new ServerAddress(host, port)), dbName);
        }

        @Bean //(name="SubscriberMappingMongoConverter")
        @Qualifier("billingMappingMongoConverter")
        public MappingMongoConverter billingMappingMongoConverter(@Qualifier("billingMongoDbFactory")MongoDbFactory mongoDbFactory,
                                                                  @Qualifier("billingCustomConversions") CustomConversions customConversions) throws Exception {
            MongoMappingContext mappingContext = new MongoMappingContext();
            DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
            MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mappingContext);
            converter.setCustomConversions(billingCustomConversions());
            converter.afterPropertiesSet();
            return converter;
        }

        @Bean //(name="SubscriberCustomConversions")
        @Qualifier("billingCustomConversions")
        public CustomConversions billingCustomConversions(){
            List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();
            return new CustomConversions(converters);
        }


} 
