/**
 * PersonTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.scopes;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class PersonTest {

    @Test
    public void test() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        System.out.println("Looking up 'p1'");
        Person p1 = ctx.getBean("p1", Person.class);
                
        System.out.println("Looking up 'p1' again");
        Person p2 = ctx.getBean("p1", Person.class);
        
        Assert.assertEquals(p1, p2);

        System.out.println("======================================================");
        System.out.println("Evaporizing the beans...");
        VolatileScope volatileScope = ctx.getBean("volatileScope", VolatileScope.class);
        volatileScope.vaporize();
        System.out.println("Evaporization Completed.");
        System.out.println("======================================================");

        System.out.println("Looking up 'p1'");
        Person p3 = ctx.getBean("p1", Person.class);
                
        System.out.println("Looking up 'p1' again");
        Person p4 = ctx.getBean("p1", Person.class);
        
        Assert.assertEquals(p3, p4);
    }
}
