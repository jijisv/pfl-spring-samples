/**
 * PersonWithResourceQualifierTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiji_Sasidharan
 */
public class PersonWithResourceQualifierTest {
    
    @Test
    public void test() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextWithResourceQualifier.xml");
            PersonWithResourceQualifier p = ctx.getBean(PersonWithResourceQualifier.class);
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertTrue(e.getMessage(), false);
        }
    }
}
