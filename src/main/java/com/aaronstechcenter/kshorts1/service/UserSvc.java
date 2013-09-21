/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.service;

import com.aaronstechcenter.kshorts1.data.User;

/**
 *
 * @author Aaron Ploetz
 */
public interface UserSvc {
    
    public User getUserLogin(String email_, String password_) throws Exception;
    
    public Integer createNewUser (User user_) throws Exception;
    
}
