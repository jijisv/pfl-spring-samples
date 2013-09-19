/**
 * AddressEditor.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.propertyeditors;

import java.beans.PropertyEditorSupport;

/**
 * @author jiji_sasidharan
 */
public class AddressEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] elements = text.split("[,]");
        
        Address address = new Address();
        address.setDoorNo(elements[0]);
        address.setStreet(elements[1]);
        address.setCity(elements[2]);
        address.setZipCode(elements[3]);
        setValue(address);
    }
}
