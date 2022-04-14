package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.bean.Pet;

@Configuration
public class PetConfig {

	@Bean("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Bruno");
		return pet;
	}
}
