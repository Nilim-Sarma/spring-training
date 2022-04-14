package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.interfaces.Animal;
import com.te.springcoreannotations.interfaces.Cat;
import com.te.springcoreannotations.interfaces.Dog;

@Configuration
public class AnimalConfig {

	@Bean("cat")
	public Animal getCat() {
		return new Cat();
	}

	@Bean("dog")
	public Animal getDog() {
		return new Dog();
	}
}