package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.util.MySingletonBean;

import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j
class DemoApplicationTests {
	
	@Autowired
	MySingletonBean bean;
	
	@Test
	void contextLoads() {
		log.debug("hello");
	}
	
	@Test
	void beanUtilTest() {
		bean.showMessage();
	}

}
