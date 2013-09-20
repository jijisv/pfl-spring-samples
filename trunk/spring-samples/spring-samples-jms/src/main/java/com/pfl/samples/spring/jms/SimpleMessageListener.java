/**
 * SimpleMessageListener.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author Jiji_Sasidharan
 */
public class SimpleMessageListener implements MessageListener {

    /* (non-Javadoc)
     * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
     */
    public void onMessage(Message message) {
        try {
            if (message instanceof TextMessage) {
                System.out.println("******" + ((TextMessage)message).getText());
            } else {
                System.out.println("Unrecognizable message");
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
