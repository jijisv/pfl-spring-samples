/**
 * Person.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.beans;


/**
 * @author Jiji_Sasidharan
 */
public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	/**
	 * Default Constructor
	 */
	public Person() {
	}

	/**
	 * Return firstName.
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set firstName
	 * 
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Return lastName.
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Set lastName
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Return age.
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Set age
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println(firstName);
	}

}
