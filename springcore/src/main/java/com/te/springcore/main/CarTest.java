package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Car;

public class CarTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}
}
