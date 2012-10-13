/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.cpns;

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
			ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			Person personBean1 = ctx.getBean("person1", Person.class);
			Assert.assertEquals(personBean1.getFirstName(), "John");
			Assert.assertEquals(personBean1.getAddress().getHouseNo(), "123");
			
			Person personBean2 = ctx.getBean("person2", Person.class);
			Assert.assertEquals(personBean2.getFirstName(), "Joe");
			Assert.assertEquals(personBean2.getAddress().getHouseNo(), "321");
			
            Person personBean3 = ctx.getBean("person3", Person.class);
            Assert.assertEquals(personBean3.getFirstName(), "Mary");
            Assert.assertEquals(personBean3.getAddress().getHouseNo(), "321");
            Assert.assertEquals(personBean3.getEmergencyAddrRef().getHouseNo(), "123");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
