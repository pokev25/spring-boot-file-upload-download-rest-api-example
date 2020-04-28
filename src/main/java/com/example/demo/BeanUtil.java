package com.example.demo;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class BeanUtil {
	
	public static <T> T getBean(Class<T> beanClass) {
		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		return context.getBean(beanClass);
	}	
}
