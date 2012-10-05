/**
 * HelloWorldTest.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiji_Sasidharan
 *
 */
public class HelloWorldTest {
	
	@Test
	public void testGreet() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);
		Assert.assertEquals(helloWorld.getMessage(), "Hello World");
		
	}
}
