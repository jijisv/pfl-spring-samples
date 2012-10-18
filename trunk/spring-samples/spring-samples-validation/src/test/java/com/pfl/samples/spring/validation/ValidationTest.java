/**
 * ValidationTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.validation;

import java.util.Locale;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author jiji_sasidharan
 */
public class ValidationTest {
    
    @Test
    public void testAddress() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Address address = ctx.getBean(Address.class);
        Validator validator = ctx.getBean("addressValidator", Validator.class);
        
        BindException errors = new BindException(address, Address.class.getName());
        ValidationUtils.invokeValidator(validator, address, errors);
        
        if (errors.hasErrors()) {
            System.out.println("Errors: " + errors.getErrorCount());
            for (ObjectError error : errors.getAllErrors()) {
              System.out.println(ctx.getMessage(error, Locale.getDefault()));
//              for (int i = 0; i < error.getCodes().length; i++) {
//                  System.out.println(error.getCodes()[i]);
//              }
            }
        }
        
    }
    
    @Test
    public void testPerson() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
            Person p = ctx.getBean(Person.class);
            Validator v = ctx.getBean("personValidator", Validator.class);
            
            BindException errors = new BindException(p, p.getClass().getName());
            ValidationUtils.invokeValidator(v, p, errors);

            if (errors.hasErrors()) {
                System.out.println("Errors: " + errors.getErrorCount());
                for (ObjectError error : errors.getAllErrors()) {
                  System.out.println(ctx.getMessage(error, Locale.getDefault()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
