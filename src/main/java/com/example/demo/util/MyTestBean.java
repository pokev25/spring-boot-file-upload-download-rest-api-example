package com.example.demo.util;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MyTestBean {

	MyTestBean(){
		log.info("MyTestBean");
	}

	public String getHello() {
		return "hello";
	}
	
}
