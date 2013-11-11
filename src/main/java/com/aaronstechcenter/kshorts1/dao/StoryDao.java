/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.dao;

import com.aaronstechcenter.kshorts1.data.Story;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aploetz
 */
public class StoryDao extends MongoDBDao {
    private static final String DATABASENAME = "kShorts";
    private static final String COLLECTIONNAME = "Story";
    
    public StoryDao() {
        super(DATABASENAME,COLLECTIONNAME);
    }
    
    public Integer insertStory(Story story_) {
        BasicDBObject doc = new BasicDBObject();
        //add appends here
        
        WriteResult result = collection.insert(doc);
        
        if (result.getN() != 0) {
            System.out.println("Insert into " + getCollectionName() + " collection failed.");
        }
        
        return result.getN();
    }
    
    public Story getStoryByID(Long storyID_) {
        BasicDBObject query = new BasicDBObject("storyID", storyID_);
        DBObject tempStory = collection.findOne(query);

        Story returnVal = marshallStory(tempStory);
        
        return returnVal;
    }
    
    public List<Story> getStoryByAuthor (Long authorID_) {
        List<Story> returnVal = new ArrayList<Story>();
        
        return returnVal;
    }
    
    public List<Story> getStoryByCategory (String category_) {
        List<Story> returnVal = new ArrayList<Story>();
        
        return returnVal;
    }
    
    private Story marshallStory(DBObject story_) {
        Story returnVal = new Story();
        
        //set Story properties from the MongoDB DBObject
        
        return returnVal;
    }
}
