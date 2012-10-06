/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.autowire.byName;

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
			ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextByName.xml");
			Person personBean1 = ctx.getBean("personBean", Person.class);
			Assert.assertEquals(personBean1.getPresentAddress().getHouseNo(), "123");
			Assert.assertEquals(personBean1.getPermanentAddress().getHouseNo(), "321");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
