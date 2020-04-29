package com.example.demo.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

	@Autowired
	MySingletonBean bean;
	
	@PostConstruct
	private void hello() {
		bean.showMessage();
		bean.showMessage();
		bean.showMessage();
	}
}
