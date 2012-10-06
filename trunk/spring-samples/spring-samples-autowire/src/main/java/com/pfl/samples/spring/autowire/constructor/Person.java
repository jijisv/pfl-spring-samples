/**
 * Person.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.autowire.constructor;

/**
 * @author Jiji_Sasidharan
 *
 */
public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	private Address address;

	/**
	 * Default Constructor
	 */
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
	}
	
	/**
	 * @param address
	 */
	public Person(Address address) {
		this();
		setAddress(address);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param address
	 */
	public Person(String firstName, String lastName, int age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

	/**
	 * Return firstName.
	 * 
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
	 * 
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Set lastName
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Return age.
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Set age
	 * 
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Return address.
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Set address
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
