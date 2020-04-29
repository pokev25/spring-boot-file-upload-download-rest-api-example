package com.example.demo.util;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MySingletonBean {

	@Autowired
	private Provider<MyPrototypeBean> provider;

	public void showMessage() {
		MyPrototypeBean bean = provider.get();
		log.info("Hi, the time is {}", bean.getDateTime());
	}
}
