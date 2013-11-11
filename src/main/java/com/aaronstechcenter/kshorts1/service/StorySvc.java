/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.service;

import com.aaronstechcenter.kshorts1.data.Story;
import java.util.List;

/**
 *
 * @author aploetz
 */
public interface StorySvc {
    
    public Integer insertStory(Story story_) throws Exception;
    
    public Story getStoryByID(Long storyID_) throws Exception;
    
    public List<Story> getStoryByAuthor(Long authorID_) throws Exception;
    
    public List<Story> getStoryByCategory(String category_) throws Exception;
}
