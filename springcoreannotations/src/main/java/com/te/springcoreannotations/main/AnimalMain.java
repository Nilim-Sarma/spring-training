package com.te.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.bean.Pet;
import com.te.springcoreannotations.config.AllConfig;

public class AnimalMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AllConfig.class);
		Pet pet = applicationContext.getBean("pet", Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().makeSound();
	}
}
