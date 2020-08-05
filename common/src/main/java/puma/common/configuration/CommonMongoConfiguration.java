package puma.common.configuration;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

@Configuration
@EnableMongoRepositories( basePackages = "puma.common.repository",mongoTemplateRef = "commonMongoTemplate")
@PropertySource({"classpath:common.properties"})
public class CommonMongoConfiguration {
    @Bean
    @Qualifier(value="commonMongoTemplate")
    public MongoTemplate commonMongoTemplate(@Qualifier("commonMongoDbFactory") MongoDbFactory factory) {
        System.out.println("###INside commonMongoTemplate creation " + factory.getDb().getName());
        MongoTemplate mongoTemplate = new MongoTemplate(factory);
        return mongoTemplate;
    }

    @Bean //(name="ProductMongo")
    @Qualifier(value="commonMongo")
    public MongoClient commonMongo(@Qualifier("commonMongoClientURI") MongoClientURI mongoClientURI) throws UnknownHostException {
        System.out.println("###INside MOngoClient creation");
        return new MongoClient(mongoClientURI);
    }

    @Bean //(name="ProductMongoClientURI")
    @Qualifier(value="commonMongoClientURI")
    public MongoClientURI commonMongoClientURI(@Value("${view.db.common.host}") String host, @Value("${view.db.common.port}") int port,
                                         @Value("${view.db.common.name}") String dbName,
                                         @Value("${affaince.db.username}") String username,
                                         @Value("${affaince.db.password}") String password) {
/*
        final MongoClientOptions options = MongoClientOptions.builder()
                .threadsAllowedToBlockForConnectionMultiplier(2)
                .connectionsPerHost(10)
                .connectTimeout(15000)
                .maxWaitTime(15000)
                .socketTimeout(15000)
                .heartbeatConnectTimeout(5000)
                .minHeartbeatFrequency(1000)
                .build();
*/

        return new MongoClientURI("mongodb://" /*+ username + ":" + password + "@" */
                + host
                + ":"
                + port
                + "/" +
                dbName);
    }

    @Bean //(name="productMongoDbFactory")
    @Qualifier(value="commonMongoDbFactory")
    public MongoDbFactory commonMongoDbFactory(@Value("${view.db.common.host}") String host, @Value("${view.db.common.port}") int port,
                                                @Value("${view.db.common.name}") String dbName) throws UnknownHostException {
        System.out.println("###INside mongoDbFactory creation");
        return new SimpleMongoDbFactory(new MongoClient(new ServerAddress(host, port)), dbName);
    }

    public DB db(@Qualifier("commonMongo")MongoClient mongoClient){
        return mongoClient.getDB("${view.db.common.name}");
    }
}
