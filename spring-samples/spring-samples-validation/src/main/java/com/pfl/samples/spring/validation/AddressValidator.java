/**
 * AddressValidator.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * 
 * @author jiji_sasidharan
 */
public class AddressValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Address.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "houseNo", "value.required", "Null not allowed.");
        ValidationUtils.rejectIfEmpty(errors, "street", "value.required", "Null not allowed.");
        ValidationUtils.rejectIfEmpty(errors, "city", "value.required", "Null not allowed.");
        ValidationUtils.rejectIfEmpty(errors, "zipCode", "value.required", "Null not allowed.");
        
        Address address = (Address) target;
        if (address.getZipCode().length() != 5) {
            errors.rejectValue("zipCode", "zipCode.invalid", new Object[] {address.getZipCode()}, 
                    "ZipCode should be 5 character long");
        }
    }
}
