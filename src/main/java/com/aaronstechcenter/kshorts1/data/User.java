package com.aaronstechcenter.kshorts1.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aaron Ploetz
 */
@XmlRootElement(name = "user")
public class User {
    private Long customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String regDate;
    private String url;
    
    @XmlElement(name = "userID")
    public Long getCustomerID() {
        return this.customerID;
    }
    
    public void setCustomerID(Long value) {
        this.customerID = value;
    }
    
    @XmlElement(name = "firstName")
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String value) {
        this.firstName = value;
    }
    
    @XmlElement(name = "lastName")
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String value) {
        this.lastName = value;
    }
    
    @XmlElement(name = "email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String value) {
        this.email = value;
    }
    
    @XmlElement(name = "password")
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String value) {
        this.password = value;
    }
    
    @XmlElement(name = "regDate")
    public String getRegDate() {
        return this.regDate;
    }
    
    public void setRegDate(String value) {
        this.regDate = value;
    }
    
    @XmlElement(name = "url")
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String value) {
        this.url = value;
    }
}
