/**
 * Person1Test.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class Person1Test {

    /**
     * test
     */
    @Test
    public void test()  {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
            Person1 p = ctx.getBean(Person1.class);
            p.getHomeAddress().setAddress("Home");
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertTrue(e.getMessage(), false);
        }

    }
}
