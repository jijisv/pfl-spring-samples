/**
 * AddressType.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.propertyeditors;

/**
 * 
 * @author jiji_sasidharan
 */
public class AddressType {
    
    private String type;
    private boolean confidential;
    
    public AddressType(String type, boolean confidential) {
        this.type = type;
        this.confidential = confidential;
    }
    
    @Override
    public String toString() {
        return (confidential? "*" : "") + type;
    }
}
