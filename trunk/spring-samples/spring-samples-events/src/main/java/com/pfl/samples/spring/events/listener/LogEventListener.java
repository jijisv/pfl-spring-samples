/**
 * LogEventListener.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.events.listener;

import org.springframework.context.ApplicationListener;

import com.pfl.samples.spring.events.event.LogEvent;

/**
 * @author Jiji_Sasidharan
 */
public class LogEventListener implements ApplicationListener<LogEvent> {

    /* (non-Javadoc)
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     */
    public void onApplicationEvent(LogEvent e) {
        try {
            System.out.println("LogEventListener -> Start");
            Thread.sleep(1000);
            System.out.println("LogEventListener -> message : " + e.getMessage());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
