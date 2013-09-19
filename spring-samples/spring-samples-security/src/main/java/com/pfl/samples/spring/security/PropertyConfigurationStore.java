/**
 * PropertyConfigurationStore.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.security;

import java.net.URL;
import java.util.Properties;

/**
 * Secured Configuration Source.
 * 
 * @author Jiji_Sasidharan
 */
public class PropertyConfigurationStore implements ConfigurationStore {

    private Properties props = null;

    /**
     * constructor
     */
    public PropertyConfigurationStore(URL fileName) {
        props = load(fileName);
    }
    
    /**
     * Load the file.
     * @param fileName
     */
    protected Properties load(URL fileName) {
        try {
            Properties props = new Properties();
            props.load(fileName.openStream());
            return props;
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize SecureConfigurationStore", e);
        }
    }

    /* (non-Javadoc)
     * @see com.pfl.samples.spring.security.ConfigurationStore#getConfig(java.lang.String)
     */
    public String getConfig(String configName) {
        return props.getProperty(configName);
    }
}
