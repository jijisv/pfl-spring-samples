/**
 * PersonFactory.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.beans;

/**
 * @author Jiji_Sasidharan
 */
public class PersonFactory {

	// make constructor private
	private PersonFactory()	{
		;
	}
	
	/**
	 * static factory method to create PersonFactory object.
	 * @return PersonFactory
	 */
	public static PersonFactory getInstance() {
		return new PersonFactory();
	}
	
	/**
	 * Factory method to create Person object with name "John"
	 * @return Person
	 */
	public Person getJohn(){
		Person person = new Person();
		person.setFirstName("John");
		return person;
	}

	/**
	 * Factory method to create Person object with name "Joy"
	 * @return Person
	 */
	public Person getJoy(){
		Person person = new Person();
		person.setFirstName("Joy");
		return person;
	}
	
	/**
	 * Factory method to create Person object
	 * @param name the first name of the person
	 * @return Person
	 */
	public Person getPerson(String name){
		Person person = new Person();
		person.setFirstName(name);
		return person;
	}
}
