/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amtest.SpringOauth2Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Theam
 */
@RestController
public class HelloController {
    
    
    @GetMapping("/")
    public String firstPage(){
        return "Welcome to Page 1 : firstPage controller RUN";
    }    
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to myWeb : hello from controller";
    }
    @GetMapping("/test")
    public String testMesg(){
        return "Test : Test 1 2 3 4";
    }    
    
}

