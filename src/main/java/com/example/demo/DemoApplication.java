package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.util.GenericHandler;
import com.example.demo.util.MyTestBean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		MyTestBean bean = context.getBean(MyTestBean.class);
		log.info(bean.getHello());
		
		GenericHandler handler = new GenericHandler();
		log.info(handler.getBean());
	}
}
