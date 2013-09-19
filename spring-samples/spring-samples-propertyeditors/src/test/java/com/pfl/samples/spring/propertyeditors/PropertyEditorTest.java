/**
 * PropertyEditorTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.propertyeditors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author jiji_sasidharan
 */
public class PropertyEditorTest {

    @Test
    public void testPerson() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
            Person person = ctx.getBean(Person.class);
            assertEquals(person.getAddress().getDoorNo(), "#20");
            person.print();
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testAddress() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
            Address address = ctx.getBean(Address.class);
            System.out.println(address);
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(e.getMessage(), false);
        }
    }
}
