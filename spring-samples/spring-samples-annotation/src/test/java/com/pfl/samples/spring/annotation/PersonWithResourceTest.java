/**
 * PersonWithResourceTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class PersonWithResourceTest {

    @Test
    public void test() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextWithResource.xml");
            PersonWithResource p = ctx.getBean(PersonWithResource.class);
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(e.getMessage(), false);
        }
    }
}
