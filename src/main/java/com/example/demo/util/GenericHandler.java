package com.example.demo.util;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;


public class GenericHandler {

	@Autowired
	private Provider<MyTestBean> provider;
	
	private MyTestBean bean;
	
	public GenericHandler(){
		bean = BeanUtil.getBean(MyTestBean.class);
	}
	
	public String getBean() {
		//MyTestBean bean = provider.get();
		return bean.getHello();
	}
}
