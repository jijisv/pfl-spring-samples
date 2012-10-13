/**
 * Address.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

/**
 * @author Jiji_Sasidharan
 */
public class Address {
	
	private String address;

    /**
     * Return address.
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getAddress();
    }

}
