package com.te.springcoreannotations.interfaces;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats pedigree");
	}

	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}

}
