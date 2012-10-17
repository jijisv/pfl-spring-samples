/**
 * LogEvent.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.events.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Jiji_Sasidharan
 */
public class LogEvent extends ApplicationEvent {

    private String message;
    
    /**
     * @param source
     */
    public LogEvent(Object source, String message) {
        super(source);
        this.setMessage(message);
    }

    /**
     * Return message.
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
