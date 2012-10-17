/**
 * PersonWithInjectTest.java
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
public class PersonWithInjectTest {

    @Test
    public void test() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextWithInject.xml");
            PersonWithInject p = ctx.getBean(PersonWithInject.class);
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(e.getMessage(), false);
        }
    }
}
