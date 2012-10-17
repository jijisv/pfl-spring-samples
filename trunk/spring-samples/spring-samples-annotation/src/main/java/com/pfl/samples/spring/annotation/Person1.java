/**
 * Person1.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Person class
 * 
 * @author Jiji_Sasidharan
 */
@Component("p1")
public class Person1 {

    @Value("John")
    private String name;

    @Resource
    //@Autowired
    private Address1 homeAddress;

    @Resource
    //@Autowired
    private Address1 officeAddress;

    /**
     * print
     */
    public void print() {
        System.out.println("Name       : " + name);
        System.out.println("Home       : " + getHomeAddress());
        System.out.println("Office     : " + getOfficeAddress());
    }

    /**
     * Return homeAddress.
     * @return the homeAddress
     */
    public Address1 getHomeAddress() {
        return homeAddress;
    }

    /**
     * Set homeAddress
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(Address1 homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * Return officeAddress.
     * @return the officeAddress
     */
    public Address1 getOfficeAddress() {
        return officeAddress;
    }

    /**
     * Set officeAddress
     * @param officeAddress the officeAddress to set
     */
    public void setOfficeAddress(Address1 officeAddress) {
        this.officeAddress = officeAddress;
    }

}
