/**
 * Person.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.autowire.byName;

/**
 * @author Jiji_Sasidharan
 *
 */
public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private Address presentAddress;
	private Address permanentAddress;

	/**
	 * Default Constructor
	 */
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
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
	 * Return presentAddress.
	 * @return the presentAddress
	 */
	public Address getPresentAddress() {
		return presentAddress;
	}

	/**
	 * Set presentAddress
	 * @param presentAddress the presentAddress to set
	 */
	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	/**
	 * Return permanentAddress.
	 * @return the permanentAddress
	 */
	public Address getPermanentAddress() {
		return permanentAddress;
	}

	/**
	 * Set permanentAddress
	 * @param permanentAddress the permanentAddress to set
	 */
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}
