package com.te.springjaxb.bean;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Data
@XmlRootElement(name = "std_info")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student implements Serializable {
	@XmlElement(name = "std_id")
	private Integer id;
	@XmlElement(name = "std_name")
	private String name;
	@XmlElement(name = "std_dob")
	private Date dob;
//	@XmlTransient
	private String password;
}
