package com.te.springjaxb.main;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.springjaxb.bean.Student;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(100);
		student.setName("Nilim");
		student.setDob(new Date());
		student.setPassword("qwerty");
		System.out.println(student);
		System.out.println("===========================");

		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Marshaller createMarshaller = context.createMarshaller();
			createMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			createMarshaller.marshal(student, new File("student.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
