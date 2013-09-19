/**
 * CustomPropertyEditorRegistrar.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.propertyeditors;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.pfl.samples.spring.propertyeditors.editor.AddressTypeEditor;

/**
 * @author jiji_sasidharan
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(AddressType.class, new AddressTypeEditor());
    }

}
