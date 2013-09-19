/**
 * CustomUserDetailsService.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 
 * @author Jiji_Sasidharan
 */
public class CustomUserDetailsService implements UserDetailsService {

    private ConfigurationStore configurationStore;

    /**
     * 
     */
    public CustomUserDetailsService(ConfigurationStore store) {
        this.configurationStore = store;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
     */
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        String configLine = configurationStore.getConfig(userName);
        if (configLine == null || configLine.trim().equals("")){
            throw new UsernameNotFoundException(userName + " not found.");
        }
        configLine = configLine.trim();
        
        int roleStartIndex = configLine.lastIndexOf("{");
        // excluding the comma (,)
        String password = configLine.substring(0, roleStartIndex - 1);
        // excluding the the { and }
        String roleList = configLine.substring(roleStartIndex + 1, configLine.length() - 1);
        
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String role : roleList.split("[,]")) {
            authorities.add(new SimpleGrantedAuthority(role.trim()));
        }
        return new User(userName, password, authorities);
    }
}
