/**
 * Address1.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Jiji_Sasidharan
 */
@Component("address")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Address1 {
	
    @Value("addrs")
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
        return "Address[" + getAddress() + "]";
    }

}
