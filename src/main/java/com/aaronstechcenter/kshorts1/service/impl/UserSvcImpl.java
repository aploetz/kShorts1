/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.service.impl;

import com.aaronstechcenter.kshorts1.service.UserSvc;
import com.aaronstechcenter.kshorts1.dao.UserDao;
import com.aaronstechcenter.kshorts1.dao.KShortsDao;
import com.aaronstechcenter.kshorts1.data.User;
import java.util.ArrayList;
import javax.xml.soap.SOAPException;
/**
 *
 * @author Aaron Ploetz
 */
public class UserSvcImpl implements UserSvc {
    private UserDao uDao;
    
    public UserSvcImpl() {
        uDao = new UserDao();
    }
    
    public UserSvcImpl(ArrayList<KShortsDao> daoList) {
        if (daoList != null) {
            for (KShortsDao dao : daoList) {
                if (dao instanceof UserDao) {
                    uDao = (UserDao) dao;
                }
            }
        }
        
        if (uDao == null) {
            uDao = new UserDao();
        }
    }
    
    @Override
    public User getUserLogin(String email_, String password_) throws SOAPException {
        User user = uDao.getUserByEmail(email_);

        if (user != null) {
            if (!password_.equals(user.getPassword())) {
                SOAPException ex = new SOAPException("Invalid password");
                throw ex;
            }
        } else {
            SOAPException ex = new SOAPException("User not found by email");
            throw ex;
        }
        
        return user;
    }
    
    @Override
    public Integer createNewUser (User user_) throws SOAPException {
        user_.setCustomerID(generateCustomerID());
        return uDao.insertNewUser(user_);
    }
    
    private Long generateCustomerID() {
        return System.currentTimeMillis();
    }
}
