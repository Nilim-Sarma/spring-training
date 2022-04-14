package com.te.springjaxb.bean;

import java.io.Serializable;
import java.util.Date;

import javax.print.attribute.standard.MediaSize.NA;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"user_name" , "user_id"})
public class User implements Serializable {
	@JsonProperty("user_id")
	private int id;
	@JsonProperty("user_name")
	private String name;
	@JsonIgnore
	private String password;
	@JsonProperty("user_dob")
	private Date dob;
}
