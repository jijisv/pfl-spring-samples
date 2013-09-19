/**
 * Person.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.propertyeditors;

/**
 * 
 * @author jiji_sasidharan
 */
public class Person {

    private String name;
    private int age;
    private Address address;
    
    /**
     * constructor 
     */
    public Person() {
    }

    /**
     * Return name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
    /**
     * print
     */
    public void print() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Address : " + address);
    }
}
