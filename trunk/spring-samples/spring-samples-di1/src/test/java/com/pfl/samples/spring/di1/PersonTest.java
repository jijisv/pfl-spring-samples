/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.di1;

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
			ctx.getBean("personDefault", Person.class).print();
			ctx.getBean("constArg1", Person.class).print();
			ctx.getBean("constArgType", Person.class).print();
			ctx.getBean("constArgIndex", Person.class).print();
			ctx.getBean("constArgAnotherBean", Person.class).print();
			ctx.getBean("constArgByName", Person.class).print();
			System.out.println("=========================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
