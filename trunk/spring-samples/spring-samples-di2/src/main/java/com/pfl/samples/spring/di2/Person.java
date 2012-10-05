/**
 * Person.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.di2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


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
	
	private Map<String, String> phoneNumbers;
	private Properties emailIds;
	private Set<String> subscriptions;
	private List<Person> friends;
	
	private String[] aliases;
	
	/**
	 * Default Constructor
	 */
	public Person() {
		this.firstName = "Default";
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

	/**
	 * Return phoneNumbers.
	 * @return the phoneNumbers
	 */
	public Map<String, String> getPhoneNumbers() {
		return phoneNumbers;
	}

	/**
	 * Set phoneNumbers
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(Map<String, String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	/**
	 * Return emailIds.
	 * @return the emailIds
	 */
	public Properties getEmailIds() {
		return emailIds;
	}

	/**
	 * Set emailIds
	 * @param emailIds the emailIds to set
	 */
	public void setEmailIds(Properties emailIds) {
		this.emailIds = emailIds;
	}

	/**
	 * Return subscriptions.
	 * @return the subscriptions
	 */
	public Set<String> getSubscriptions() {
		return subscriptions;
	}

	/**
	 * Set subscriptions
	 * @param subscriptions the subscriptions to set
	 */
	public void setSubscriptions(Set<String> subscriptions) {
		this.subscriptions = subscriptions;
	}

	/**
	 * Return friends.
	 * @return the friends
	 */
	public List<Person> getFriends() {
		return friends;
	}

	/**
	 * Set friends
	 * @param friends the friends to set
	 */
	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	
	/**
	 * Return aliases.
	 * @return the aliases
	 */
	public String[] getAliases() {
		return aliases;
	}

	/**
	 * Set aliases
	 * @param aliases the aliases to set
	 */
	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}

	/**
	 * print
	 */
	public void print() {
		System.out.println(firstName + " " + lastName + ", " + age + "yrs.");
		String aliasesStr = "";
		for (String alias : aliases) {
			aliasesStr += alias + ";";
		}
		System.out.println("Aliases          : " + aliasesStr);
		System.out.println("Present Address  : " + presentAddress);
		System.out.println("Permanent Address: " + permanentAddress);
		System.out.println("Phone Numbers    : " + phoneNumbers);
		System.out.println("Email Ids        : " + emailIds);
		System.out.println("Subscriptions    : " + subscriptions);
		System.out.println("Friends          : " + friends);
	}

}
