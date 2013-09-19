/**
 * HelloWorldController.java
 * http://programmingforliving.blogspot.com
 */
package com.pfl.samples.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloWorldController.
 * 
 * @author Jiji_Sasidharan
 */
@Controller
public class HelloWorldController {

    /**
     * 
     */
    public HelloWorldController() {
    }
    
    @RequestMapping (value="/hello", method = RequestMethod.GET)
    public ModelAndView sayHello() {
        return new ModelAndView("result.jsp", "message", "Hi there!");
    }

}
