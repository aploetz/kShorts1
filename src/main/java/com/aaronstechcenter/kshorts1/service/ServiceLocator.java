/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.service;

import java.util.ArrayList;

import com.aaronstechcenter.kshorts1.dao.KShortsDao;
import com.aaronstechcenter.kshorts1.service.UserSvc;
import com.aaronstechcenter.kshorts1.service.impl.UserSvcImpl;

/**
 *
 * @author Aaron Ploetz
 */
public class ServiceLocator {
    public ServiceLocator() {
    }

    public UserSvc getUserService(ArrayList<KShortsDao> daos_) {
        return new UserSvcImpl(daos_);
    }
}
