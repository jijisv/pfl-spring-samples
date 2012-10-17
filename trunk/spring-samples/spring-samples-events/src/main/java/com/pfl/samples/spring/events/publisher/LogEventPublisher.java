/**
 * LogEventPublisher.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.events.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.pfl.samples.spring.events.event.LogEvent;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class LogEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher = null;
    
    /* (non-Javadoc)
     * @see org.springframework.context.ApplicationEventPublisherAware#setApplicationEventPublisher(org.springframework.context.ApplicationEventPublisher)
     */
    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
        publisher = arg0;
    }

    /**
     * publish
     * @param message
     */
    public void publish(String message) {
        publisher.publishEvent(new LogEvent(this, message));
    }
}
