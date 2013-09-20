/**
 * SimpleMessageListenerApp.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class SimpleMessageListenerApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/jms-context.xml");
    }

}
