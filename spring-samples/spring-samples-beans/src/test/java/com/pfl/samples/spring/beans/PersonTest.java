/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiji_Sasidharan
 */
public class PersonTest {
	
	@Test
	public void test() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ctx.getBean("john", Person.class).print();
		ctx.getBean("joy", Person.class).print();
		ctx.getBean("mary", Person.class).print();
	}
}
