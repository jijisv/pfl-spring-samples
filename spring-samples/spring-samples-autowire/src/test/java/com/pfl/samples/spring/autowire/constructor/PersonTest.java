/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.autowire.constructor;

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
			ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextConstructor.xml");
			Person personBean1 = ctx.getBean("person1", Person.class);
			Assert.assertEquals(personBean1.getAddress().getHouseNo(), "123");
			Assert.assertEquals(personBean1.getFirstName(), "");
			
			Person personBean2 = ctx.getBean("person2", Person.class);
			Assert.assertEquals(personBean2.getAddress().getHouseNo(), "123");
			Assert.assertEquals(personBean2.getFirstName(), "Joe");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
