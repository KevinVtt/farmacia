package com.farmacia.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import dev.morphia.Datastore;
import dev.morphia.Morphia;
import io.github.cdimascio.dotenv.Dotenv;

public class MongoDBConnection {

    private static Datastore datastore;
    public static void connect() {
        Dotenv dotenv = Dotenv.load();
        String MONGO_URI = dotenv.get("MONGO_URI");
        MongoClient mongoClient =
                MongoClients.create(MONGO_URI);

        datastore = Morphia.createDatastore(
                mongoClient,
                "farmacia"
        );

        datastore.getMapper().mapPackage("com.farmacia.model");
        datastore.ensureIndexes();
    }

    public static Datastore getDatastore() {
        return datastore;
    }
}