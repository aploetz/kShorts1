package com.aaronstechcenter.kshorts1.userws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.aaronstechcenter.kshorts1.data.User;
import com.aaronstechcenter.kshorts1.service.UserSvc;
import com.aaronstechcenter.kshorts1.service.ServiceLocator;

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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registerUser")
    public String registerUser(@WebParam(name = "email") String email_, 
        @WebParam(name = "firstName") String firstName_, 
        @WebParam(name = "lastName") String lastName_, 
        @WebParam(name = "password") String password_, 
        @WebParam(name = "url") String url_) {
        
        String returnVal = "User successfully added.";

        ServiceLocator locator = new ServiceLocator();
        UserSvc userSvc = locator.getUserService(null);
        
        User user = new User();
        user.setEmail(email_);
        user.setFirstName(firstName_);
        user.setLastName(lastName_);
        user.setPassword(password_);
        user.setUrl(url_);
        
        try {
            Integer errorCode = userSvc.createNewUser(user);
        } catch (Exception ex) {
            returnVal = ex.toString();
        }
        
        return returnVal;
    }
        
}
