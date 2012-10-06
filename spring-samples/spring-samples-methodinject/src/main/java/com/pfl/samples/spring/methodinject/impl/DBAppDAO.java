/**
 * DBAppDAO.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.methodinject.impl;

import com.pfl.samples.spring.methodinject.AppDAO;;

/**
 * 
 * @author jiji_sasidharan
 */
public class DBAppDAO extends AppDAO {

	/* (non-Javadoc)
	 * @see com.pfl.samples.spring.methodinject.AppDAO#save(java.lang.String)
	 */
	@Override
	public String save(String data) {
		return data + " updated to DB";
	}

}
