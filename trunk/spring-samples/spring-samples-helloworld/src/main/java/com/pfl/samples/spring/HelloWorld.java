/**
 * HelloWorld.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring;

/**
 * @author Jiji_Sasidharan
 *
 */
public class HelloWorld {
	
	private String message;

	/**
	 * Return message.
	 * 
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set message
	 * 
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

	/**
	 * Print the greet message
	 */
	public void greet() {
		System.out.println(message);
	}
}
