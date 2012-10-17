/**
 * ContextEventListener.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.events.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Jiji_Sasidharan
 */
public class ContextEventListener implements ApplicationListener<ApplicationEvent> {

    /* (non-Javadoc)
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     */
    public void onApplicationEvent(ApplicationEvent arg0) {
        System.out.println(arg0.getClass().getName() + " received!");
    }
}
