package com.kgisl.zigwheels.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 */
@RestController
@RequestMapping("/hello")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    String sayGreeting() {
        return "Hello World";
    }
    
}