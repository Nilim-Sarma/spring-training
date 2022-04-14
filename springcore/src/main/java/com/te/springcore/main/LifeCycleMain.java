package com.te.springcore.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.LifeCycleDummy;

public class LifeCycleMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
		LifeCycleDummy cycleDummy = (LifeCycleDummy) context.getBean("lifecycle");
		System.out.println(cycleDummy);
	}
}
