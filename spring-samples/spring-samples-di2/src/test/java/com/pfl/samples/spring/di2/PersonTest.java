/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.di2;

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
			System.out.println("=========================================================");
			ctx.getBean("john", Person.class).print();
			System.out.println("=========================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
