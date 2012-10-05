/**
 * Address.java
 * 
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.di1;

/**
 * @author Jiji_Sasidharan
 *
 */
public class Address {
	
	private String houseNo;
	private String street;
	private String city;
	private String zipCode;
	
	/**
	 * Return houseNo.
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}
	
	/**
	 * Set houseNo
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	/**
	 * Return street.
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * Set street
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 * Return city.
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Set city
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Return zipCode.
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	
	/**
	 * Set zipCode
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
