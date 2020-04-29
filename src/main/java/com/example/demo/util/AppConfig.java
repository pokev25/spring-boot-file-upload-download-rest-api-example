package com.example.demo.util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MyPrototypeBean prototypeBean() {
		return new MyPrototypeBean();
	}

	@Bean
	public MySingletonBean singletonBean() {
		return new MySingletonBean();
	}
}
