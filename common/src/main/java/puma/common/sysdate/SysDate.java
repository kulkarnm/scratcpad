package puma.common.sysdate;

import com.mongodb.*;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ResourceBundle;


public final class SysDate {
    private static Logger logger = LoggerFactory.getLogger(SysDate.class);
    private LocalDate localDate;
    private static SysDate sysDate;
    private static boolean productionMode;
    private static DB db;
    private static DBCollection dbCollection;
    private static String sysDateCollectionName;
    private static String sysDateTimeCollectionName;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("common");
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

        MongoClientURI mongoClientURI =  new MongoClientURI("mongodb://"
                /*+ resourceBundle.getString("affaince.db.username")
                + ":"
                + resourceBundle.getString("affaince.db.password")*/
               // + "@"
                + resourceBundle.getString("view.db.sysdate.host")
                + ":"
                + resourceBundle.getString("view.db.sysdate.port")
                + "/"
                + resourceBundle.getString("view.db.sysdate.name"));
        mongoClient = new MongoClient(mongoClientURI);
        db = mongoClient.getDB(resourceBundle.getString("view.db.sysdate.name"));
        sysDateCollectionName=resourceBundle.getString("sysdate.view.db.collection");
        dbCollection = db.getCollection(resourceBundle.getString("sysdate.view.db.collection"));
        productionMode = Boolean.parseBoolean(resourceBundle.getString("subscription.productionMode"));
    }

    private SysDate() {

    }

    public synchronized static void setCurrentDate(LocalDate currentDate) {
        dbCollection.drop();
        dbCollection = db.getCollection(sysDateCollectionName);
        DateTimeFormatter formatter =
                org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
        String date = formatter.print(currentDate);
        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.put("_id",1);
        basicDBObject.put("currentDate", date);
        dbCollection.save(basicDBObject);
    }

    public synchronized static LocalDate now() {
        if (productionMode) {
            return LocalDate.now();
        }
        DateTimeFormatter formatter =
                org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
        //System.out.println("###########################333" + dbCollection.getName());
        DBObject dbObject = null;
        if (dbCollection.find().hasNext()) {
            dbObject = dbCollection.find().next();
        } else {
            now();
        }
        LocalDate date = LocalDate.parse(dbObject.get("currentDate").toString(), formatter);
        if (date == null) {
            now();
        }
        return date;
    }

}
