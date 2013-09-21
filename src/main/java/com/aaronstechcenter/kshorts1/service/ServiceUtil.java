/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.service;

import org.joda.time.DateTime;
import com.aaronstechcenter.kshorts1.service.ServiceConstants;

/**
 *
 * @author Aaron Ploetz
 */
public class ServiceUtil {
    public static String getDate() {
        DateTime dateTime = new DateTime();
        return dateTime.toString(ServiceConstants.TIMESTAMP);
    }
}
