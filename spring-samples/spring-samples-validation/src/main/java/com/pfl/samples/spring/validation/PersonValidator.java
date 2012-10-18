/**
 * PersonValidator.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author jiji_sasidharan
 */
public class PersonValidator implements Validator {
    
    private AddressValidator addressValidator;

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "firstName", 
                       "firstName.required", "First Name missing.");
        errors.pushNestedPath("address");
        getAddressValidator().validate(((Person)target).getAddress(), errors);
    }

    /**
     * Return addressValidator.
     * @return the addressValidator
     */
    public AddressValidator getAddressValidator() {
        return addressValidator;
    }

    /**
     * Set addressValidator
     * @param addressValidator the addressValidator to set
     */
    public void setAddressValidator(AddressValidator addressValidator) {
        this.addressValidator = addressValidator;
    }

}
