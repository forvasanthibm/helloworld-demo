package com.example.helloworld.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties()
public class AppProperties {
    private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
    

    
}