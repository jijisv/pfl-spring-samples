/**
 * PersonWithResourceQualifier.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class PersonWithResourceQualifier {

    private String name;

    @Resource(name = "hAddress")
    private Address homeAddress;

    @Resource
    private Address officeAddress;

    @Resource
    private Address addr1;
    
    @Resource
    private Address addr2;

    @Resource
    @Qualifier("addressList")
    private List<Address> addresses;

    private Map<String, Address> addressMap;

    /**
     * constructor
     * @param homeAddress
     */
    public PersonWithResourceQualifier() {
        //this.homeAddress = homeAddress;
    }

    /**
     * Return name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return homeAddress.
     * @return the homeAddress
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * Set homeAddress
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * Return officeAddress.
     * 
     * @return the officeAddress
     */
    public Address getOfficeAddress() {
        return officeAddress;
    }

    /**
     * Set officeAddress
     * 
     * @param officeAddress the officeAddress to set
     */
    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    /**
     * Arbitrary method to set addresses
     * @param addr1
     * @param addr2
     */
    public void addAddresses(Address addr1, Address addr2) {
        this.addr1 = addr1;
        this.addr2 = addr2;
    }

    /**
     * Return addresses.
     * @return the addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Set addresses
     * @param addresses the addresses to set
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /**
     * Return addressMap.
     * @return the addressMap
     */
    public Map<String, Address> getAddressMap() {
        return addressMap;
    }

    /**
     * Set addressMap
     * @param addressMap the addressMap to set
     */
    @Resource
    @Qualifier ("addressMap")
    public void setAddressMap(Map<String, Address> addressMap) {
        this.addressMap = addressMap;
    }

    /**
     * print
     */
    public void print() {
        System.out.println("PersonWithResourceQualifier");
        System.out.println("Name       : " + name);
        System.out.println("Home       : " + homeAddress);
        System.out.println("Office     : " + officeAddress);
        System.out.println("Addr1      : " + addr1);
        System.out.println("Addr2      : " + addr2);
        System.out.println("Addresses  : " + addresses);
        System.out.println("AddressMap : " + addressMap);
    }
}
