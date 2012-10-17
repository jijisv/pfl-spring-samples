/**
 * ContextEventListenerTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.events.listener;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jiji_Sasidharan
 */
public class ContextEventListenerTest {
    
    @Test
    public void test() {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ctx.refresh();
        ctx.start();
        ctx.stop();
        ctx.close();
        
    }
}
