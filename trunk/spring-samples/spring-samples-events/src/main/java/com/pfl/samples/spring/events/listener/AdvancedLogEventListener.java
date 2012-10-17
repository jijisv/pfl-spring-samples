/**
 * AdvancedLogEventListener.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.events.listener;

import org.springframework.context.ApplicationListener;

import com.pfl.samples.spring.events.event.LogEvent;

/**
 * @author Jiji_Sasidharan
 */
public class AdvancedLogEventListener implements ApplicationListener<LogEvent> {

    /* (non-Javadoc)
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     */
    public void onApplicationEvent(LogEvent e) {
        try {
            System.out.println("AdvancedLogEventListener -> Start");
            Thread.sleep(1000);
            System.out.println("AdvancedLogEventListener -> message : " + e.getMessage());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
