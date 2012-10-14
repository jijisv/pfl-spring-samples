/**
 * PersonWithCustomQualifierTest.java
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
public class PersonWithCustomQualifierTest {

    @Test
    public void test() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextWithCustomQualifier.xml");
            PersonWithCustomQualifier p = ctx.getBean(PersonWithCustomQualifier.class);
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertTrue(e.getMessage(), false);
        }
    }
}
