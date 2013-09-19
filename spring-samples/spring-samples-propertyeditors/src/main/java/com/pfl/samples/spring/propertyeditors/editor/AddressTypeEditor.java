/**
 * AddressTypeEditor.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.propertyeditors.editor;

import java.beans.PropertyEditorSupport;

import com.pfl.samples.spring.propertyeditors.AddressType;

/**
 * @author jiji_sasidharan
 */
public class AddressTypeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text.startsWith("*")) {
            setValue(new AddressType(text.substring(1), true));
        } else {
            setValue(new AddressType(text, false));
        }
    }
}
