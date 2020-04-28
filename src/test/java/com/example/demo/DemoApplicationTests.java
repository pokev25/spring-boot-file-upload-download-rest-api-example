package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.util.GenericHandler;

import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j
class DemoApplicationTests {
	
	@Test
	void contextLoads() {

	}
	
	@Test
	void beanUtilTest() {
		GenericHandler handler = new GenericHandler();
		log.info(handler.getBean());
	}

}
