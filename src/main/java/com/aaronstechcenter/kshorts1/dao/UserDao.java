package com.aaronstechcenter.kshorts1.dao;

import com.mongodb.BasicDBObject;
//import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.aaronstechcenter.kshorts1.data.User;
import com.aaronstechcenter.kshorts1.service.ServiceUtil;

/**
 *
 * @author Aaron Ploetz
 */
public class UserDao extends MongoDBDao {
    private static final String DATABASENAME = "kShorts";
    private static final String COLLECTIONNAME = "Users";
    
    public UserDao() {
        super(DATABASENAME,COLLECTIONNAME);
    }
    
    public User getUserById(Integer userId_) {
        //TODO get user from database by userId
        User user = new User();
        
        return user;
    }
    
    public User getUserByEmail(String email_) {
        //TODO get user from database by userId
        User user = new User();
        
        BasicDBObject query = new BasicDBObject("email", email_);
        DBObject tempUser = collection.findOne(query);

        if (tempUser != null) {
            user.setCustomerID(Long.parseLong(tempUser.get("customerId").toString()));
            user.setEmail(email_);
            user.setFirstName(tempUser.get("firstName").toString());
            user.setLastName(tempUser.get("lastName").toString());
            user.setPassword(tempUser.get("password").toString());
            user.setRegDate(tempUser.get("registrationDate").toString());
            user.setUrl(tempUser.get("url").toString());
        }
        
        return user;
    }
    
    public Integer modifyUser(User user_) {
        return 0;
    }
 
    public Integer insertNewUser(User user_) {
        //Integer userId = 0;
        String timeStamp = ServiceUtil.getDate();
        
        BasicDBObject doc = new BasicDBObject("customerId", user_.getCustomerID()).
                              append("firstName", user_.getFirstName()).
                              append("lastName", user_.getLastName()).
                              append("email", user_.getEmail()).
                              append("password", user_.getPassword()).
                              append("registrationDate", timeStamp).
                              append("url", user_.getUrl());

        WriteResult result = collection.insert(doc);
        
        if (result.getN() != 0) {
            System.out.println("Insert into " + getCollectionName() + " collection failed.");
        }
        
        return result.getN();
    }
}
