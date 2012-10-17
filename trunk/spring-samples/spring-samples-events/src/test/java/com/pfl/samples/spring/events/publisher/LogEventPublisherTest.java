/**
 * LogEventPublisherTest.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.events.publisher;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfl.samples.spring.events.event.LogEvent;


/**
 * 
 * @author Jiji_Sasidharan
 */
public class LogEventPublisherTest {
    @Test
    public void testWithCtx() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextCustomEvents.xml");
        ctx.publishEvent(new LogEvent(this, "this is my first message"));
        ctx.publishEvent(new LogEvent(this, "this is my second message"));
    }

    @Test
    public void testWithPublisher() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextCustomEvents.xml");
        LogEventPublisher bean = ctx.getBean(LogEventPublisher.class);
        bean.publish("this is a my first message");
        bean.publish("this is a my second message");
    }

    @Test
    public void testMulticastWithCtx() {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContextCustomEvents.xml");
            ctx.publishEvent(new LogEvent(this, "this is my message"));
            Thread.currentThread().join(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
