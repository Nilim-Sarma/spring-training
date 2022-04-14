package com.te.springjaxb.main;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.te.springjaxb.bean.User;

public class UserMain {
	public static void main(String[] args) {
		User user = new User();
		user.setId(100);
		user.setName("Kartik Patel");
		user.setPassword("noemail");
		user.setDob(new Date());
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("user.json"), user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
