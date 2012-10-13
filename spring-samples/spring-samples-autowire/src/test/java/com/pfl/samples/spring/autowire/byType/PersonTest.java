/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.autowire.byType;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiji_Sasidharan
 *
 */
public class PersonTest {
	
	@Test
	public void test() throws Exception {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextByType.xml");
			Person personBean1 = ctx.getBean("personBean", Person.class);
			Assert.assertEquals(personBean1.getAddress().getHouseNo(), "098");
            personBean1.print();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage(), false);
        }
	}

}
