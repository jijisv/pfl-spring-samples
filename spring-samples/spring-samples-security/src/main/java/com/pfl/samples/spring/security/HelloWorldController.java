/**
 * HelloWorldController.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Jiji_Sasidharan
 */
@Controller
public class HelloWorldController {

    /**
     * 
     */
    public HelloWorldController() {
        // TODO Auto-generated constructor stub
    }

    @RequestMapping (value="/hello")
    public String hello() {
        System.out.println("inside....!!!");
        return "index.jsp";
    }
}
