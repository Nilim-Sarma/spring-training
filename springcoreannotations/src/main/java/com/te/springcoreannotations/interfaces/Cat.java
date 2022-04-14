package com.te.springcoreannotations.interfaces;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat drinks milk");
	}

	@Override
	public void makeSound() {
		System.out.println("Cat meows!");
	}

}
