package br.cesul.biblioteca.util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoUtil {

    private static final MongoClient CLIENT = MongoClients.create("mongodb://localhost:27017");

    public static MongoDatabase db() {
        return CLIENT.getDatabase("biblioteca");
    }
}
