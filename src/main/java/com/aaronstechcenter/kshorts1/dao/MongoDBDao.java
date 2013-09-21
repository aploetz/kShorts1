/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.dao;

import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 *
 * @author Aaron Ploetz
 */
public abstract class MongoDBDao extends KShortsDao {
    private String databaseName;
    private String collectionName;
    private DB db;
    private MongoClient client;
    protected DBCollection collection;
    private static final Integer MONGODB_PORT = 27017;
    private static final String MONGODB_HOSTNAME = "localhost";
    
    public MongoDBDao(String databaseName_, String collectionName_) {
        databaseName = databaseName_;
        collectionName = collectionName_;
        
        try {
            client = new MongoClient(MONGODB_HOSTNAME, MONGODB_PORT);
            client.setWriteConcern(WriteConcern.ACKNOWLEDGED);
            db = client.getDB(databaseName_);
            collection = db.getCollection(collectionName);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    public String getDatabaseName() {
        return this.db.getName();
    }
    
    public String getCollectionName() {
        return this.collection.getName();
    }
    
    public DBCollection getCollection() {
        return this.collection;
    }
    
    public void closeConnection() {
        client.close();
    }
}
