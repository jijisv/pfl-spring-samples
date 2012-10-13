/**
 * PersonTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class PersonTest {

    /**
     * test
     */
    @Test
    public void test()  {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
            Person p = ctx.getBean(Person.class);
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
