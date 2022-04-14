package com.te.springjaxb.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.springjaxb.bean.Student;

public class StudentUnmarshall {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Unmarshaller createUnmarshaller = context.createUnmarshaller();
			Student student = (Student) createUnmarshaller.unmarshal(new File("student.xml"));
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPassword());
			System.out.println(student.getDob());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
