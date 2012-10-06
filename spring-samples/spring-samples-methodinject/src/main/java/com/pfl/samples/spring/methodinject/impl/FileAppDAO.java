/**
 * FileAppDAO.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.methodinject.impl;

import com.pfl.samples.spring.methodinject.AppDAO;

/**
 * 
 * @author jiji_sasidharan
 */
public class FileAppDAO extends AppDAO {

	/* (non-Javadoc)
	 * @see com.pfl.samples.spring.methodinject.AppDAO#save(java.lang.String)
	 */
	@Override
	public String save(String data) {
		return data + " saved to File";
	}

}
