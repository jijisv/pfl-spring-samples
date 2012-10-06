/**
 * FileSave.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.methodinject.replacers;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * 
 * @author jiji_sasidharan
 */
public class FileSave implements MethodReplacer {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.support.MethodReplacer#reimplement(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		return arg2[0] + " saved to File (MR)";
	}

}
