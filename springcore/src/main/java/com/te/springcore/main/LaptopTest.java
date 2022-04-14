package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Laptop;

public class LaptopTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("laptop1.xml");
		Laptop laptop = (Laptop) context.getBean("lap");
		System.out.println(laptop);
	}
}
