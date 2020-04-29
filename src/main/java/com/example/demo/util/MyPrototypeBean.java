package com.example.demo.util;

import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPrototypeBean {
	private String dateTimeString = LocalDateTime.now().toString();

	MyPrototypeBean(){
		log.info("MyPrototypeBean");
	}
	
	public String getDateTime() {
		return dateTimeString;
	}
}
