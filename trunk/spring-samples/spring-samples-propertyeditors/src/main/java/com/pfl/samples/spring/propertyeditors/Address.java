/**
 * Address.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.propertyeditors;

/**
 * 
 * @author jiji_sasidharan
 */
public class Address {

    private AddressType addressType;
    
    private String doorNo;
    private String street;
    private String city;
    private String zipCode;
    
    /**
     * Return doorNo.
     * @return the doorNo
     */
    public String getDoorNo() {
        return doorNo;
    }
    
    /**
     * Set doorNo
     * @param doorNo the doorNo to set
     */
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
    
    /**
     * Return street.
     * @return the street
     */
    public String getStreet() {
        return street;
    }
    
    /**
     * Set street
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }
    
    /**
     * Return city.
     * @return the city
     */
    public String getCity() {
        return city;
    }
    
    /**
     * Set city
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * Return zipCode.
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Set zipCode
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    @Override
    public String toString() {
        return addressType + " : " + doorNo + ", " + street + ", " +
               city + ", " + zipCode;
    }

    /**
     * Return addressType.
     * @return the addressType
     */
    public AddressType getAddressType() {
        return addressType;
    }

    /**
     * Set addressType
     * @param addressType the addressType to set
     */
    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }
}
