package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.ScopeOfBean;

public class ScopeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
		ScopeOfBean bean = context.getBean("scope", ScopeOfBean.class);
		System.out.println(bean);

		ScopeOfBean bean1 = context.getBean("scope", ScopeOfBean.class);
		System.out.println(bean1);
		
	}
}
