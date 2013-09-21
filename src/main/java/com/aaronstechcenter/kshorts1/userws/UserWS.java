package com.aaronstechcenter.kshorts1.userws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.aaronstechcenter.kshorts1.data.User;
import com.aaronstechcenter.kshorts1.service.UserSvc;
import com.aaronstechcenter.kshorts1.service.ServiceLocator;
//import javax.xml.soap.SOAPException;

/**
 *
 * @author Aaron Ploetz
 */
@WebService(serviceName = "UserWS")
public class UserWS {

    @WebMethod(operationName = "login")
    public User getUserLogin(@WebParam(name="email") String email_, @WebParam(name="password") String password_)
      throws Exception {
        ServiceLocator locator = new ServiceLocator();
        UserSvc userSvc = locator.getUserService(null);
        User user = new User();
        
        try {
            user = userSvc.getUserLogin(email_, password_);
        } catch (Exception ex) {
            throw ex;
        }
        
        return user;
    }
        
    @WebMethod(operationName = "registerUser")
    public Integer createNewUser(@WebParam(name="user") User user_) throws Exception {
        ServiceLocator locator = new ServiceLocator();
        UserSvc userSvc = locator.getUserService(null);
        Integer returnVal = 0;
        
        try {
            returnVal = userSvc.createNewUser(user_);
        } catch (Exception ex) {
            throw ex;
        }
        
        return returnVal;
    }
}
