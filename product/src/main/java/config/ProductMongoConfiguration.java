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
@EnableMongoRepositories(mongoTemplateRef ="productMongoTemplate", basePackages = {"respository.*"})
public class ProductMongoConfiguration {
        @Bean //(name="subscriberMongoTemplate")
        @Qualifier("productMongoTemplate")
        public MongoTemplate productMongoTemplate(@Qualifier("productMongoDbFactory") MongoDbFactory factory,@Qualifier("productMappingMongoConverter") MappingMongoConverter mappingMongoConverter) {
            System.out.println("###INside productMongoDbFactory creation " + factory.getDb().getName());
            MongoTemplate mongoTemplate = new MongoTemplate(factory,mappingMongoConverter);
            MappingMongoConverter mmc = (MappingMongoConverter)mongoTemplate.getConverter();
            mmc.setCustomConversions(productCustomConversions());
            mmc.afterPropertiesSet();
            return mongoTemplate;
        }

        @Bean //(name="SubscriberMongo")
        @Qualifier("productMongo")
        public MongoClient productMongo(@Qualifier("productMongoClientURI") MongoClientURI mongoClientURI) throws UnknownHostException {
            System.out.println("###INside MOngoClient creation");
            return new MongoClient(mongoClientURI);
        }

        @Bean //(name="SubscriberMongoClientURI")
        @Qualifier("productMongoClientURI")
        public MongoClientURI productMongoClientURI(@Value("${view.db.product.host}") String host, @Value("${view.db.product.port}") int port,
                                                    @Value("${view.db.product.name}") String dbName,
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
        @Qualifier("productMongoDbFactory")
        public MongoDbFactory productMongoDbFactory(@Value("${view.db.product.host}") String host, @Value("${view.db.product.port}") int port,
                                                    @Value("${view.db.product.name}") String dbName) throws UnknownHostException {
            System.out.println("###INside mongoDbFactory creation");
            return new SimpleMongoDbFactory(new MongoClient(new ServerAddress(host, port)), dbName);
        }

        @Bean //(name="SubscriberMappingMongoConverter")
        @Qualifier("productMappingMongoConverter")
        public MappingMongoConverter productMappingMongoConverter(@Qualifier("productMongoDbFactory")MongoDbFactory mongoDbFactory,
                                                                  @Qualifier("productCustomConversions") CustomConversions customConversions) throws Exception {
            MongoMappingContext mappingContext = new MongoMappingContext();
            DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
            MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mappingContext);
            converter.setCustomConversions(productCustomConversions());
            converter.afterPropertiesSet();
            return converter;
        }

        @Bean //(name="SubscriberCustomConversions")
        @Qualifier("productCustomConversions")
        public CustomConversions productCustomConversions(){
            List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();
            return new CustomConversions(converters);
        }


} 
