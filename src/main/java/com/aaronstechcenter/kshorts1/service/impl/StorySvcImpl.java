/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.service.impl;

import com.aaronstechcenter.kshorts1.dao.KShortsDao;
import com.aaronstechcenter.kshorts1.dao.StoryDao;
import com.aaronstechcenter.kshorts1.data.Story;
import com.aaronstechcenter.kshorts1.service.StorySvc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aploetz
 */
public class StorySvcImpl implements StorySvc {
    private StoryDao sDao;
    
    public StorySvcImpl() {
        sDao = new StoryDao();
    }
    
    public StorySvcImpl(ArrayList<KShortsDao> daoList) {
        if (daoList != null) {
            for (KShortsDao dao : daoList) {
                if (dao instanceof StoryDao) {
                    sDao = (StoryDao) dao;
                }
            }
        }
        
        if (sDao == null) {
            sDao = new StoryDao();
        }
    }
    
    @Override
    public Integer insertStory(Story story_) throws Exception {
        Integer returnVal = 0;
        Long storyID = generateStoryID();
        
        
        return returnVal;
    }
    
    @Override
    public Story getStoryByID(Long storyID_) throws Exception {
        Story returnVal = sDao.getStoryByID(storyID_);
                
        return returnVal;
    }
    
    @Override
    public List<Story> getStoryByAuthor(Long authorID_) throws Exception {
        List<Story> returnVal = sDao.getStoryByAuthor(authorID_);
        
        return returnVal;
    }
    
    @Override
    public List<Story> getStoryByCategory(String category_) throws Exception {
        List<Story> returnVal = sDao.getStoryByCategory(category_);
        
        return returnVal;        
    }
    
    private Long generateStoryID() {
        return System.currentTimeMillis();
    }
}
