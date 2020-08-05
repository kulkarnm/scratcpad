package puma.common.sysdate;

import com.mongodb.*;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

public final class SysDateTime {
    private static Logger logger = LoggerFactory.getLogger(SysDateTime.class);
    private LocalDateTime localDateTime;
    private static SysDateTime sysDateTime;
    private static DB db;
    private static String sysDateTimeCollectionName;
    private static boolean productionMode;
    private static DBCollection dbCollection;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("sysdatesetting");
        MongoClient mongoClient = null;
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

        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://"
                /*+ resourceBundle.getString("affaince.db.username")
                + ":"
                + resourceBundle.getString("affaince.db.password")*/
                //+ "@"
                + resourceBundle.getString("view.db.sysdate.host")
                + ":"
                + resourceBundle.getString("view.db.sysdate.port")
                + "/"
                + resourceBundle.getString("view.db.sysdate.name"));
        mongoClient = new MongoClient(mongoClientURI);
        db = mongoClient.getDB(resourceBundle.getString("view.db.sysdate.name"));
        dbCollection = db.getCollection(resourceBundle.getString("sysdatetime.view.db.collection"));
        sysDateTimeCollectionName=resourceBundle.getString("sysdatetime.view.db.collection");
        productionMode = Boolean.parseBoolean(resourceBundle.getString("subscription.productionMode"));
    }

    private SysDateTime() {

    }

    public synchronized static void setCurrentDateTime(LocalDateTime currentDateTime) {
        dbCollection.drop();
        dbCollection = db.getCollection(sysDateTimeCollectionName);
        DateTimeFormatter formatter =
                DateTimeFormat.forPattern("yyyy-MM-dd-hh:mm:ss");
        String date = formatter.print(currentDateTime);
        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.put("_id", 1);
        basicDBObject.put("currentDateTime", date);
        dbCollection.save(basicDBObject);
    }

    public synchronized static LocalDateTime now() {
        if (productionMode) {
            return LocalDateTime.now();
        }
        DateTimeFormatter formatter =
                DateTimeFormat.forPattern("yyyy-MM-dd-hh:mm:ss");
        DBObject dbObject = null;
        if (dbCollection.find().hasNext()) {
            dbObject = dbCollection.find().next();
        } else {
            now();
        }
        LocalDateTime dateTime = LocalDateTime.parse(dbObject.get("currentDateTime").toString(), formatter);
        if (dateTime == null) {
            now();
        }
        return dateTime;
    }
}
