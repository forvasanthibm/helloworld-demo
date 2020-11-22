package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.config.AppProperties;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class HelloWorldController {
	
	  @Autowired
	  private AppProperties appProperties;
	  
	  @RequestMapping("/")
	  @ResponseBody public ResponseEntity<String> welcomeToComposer() {
		  
		  String color = appProperties.getColor();
		  System.out.println("============="+color);
		  return new ResponseEntity<String>("<p style=\"color:"+color+";font-size:100px;\">Welcome to HelloWorld!!!!</p>",   HttpStatus.CREATED); 
	  }
}
