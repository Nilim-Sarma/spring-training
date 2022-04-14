package com.te.springcore.bean;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleDummy implements Serializable, InitializingBean, 
DisposableBean {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter");
		this.id = id;
	}

	public LifeCycleDummy() {
		System.out.println("Inside constructor");

	}

	@Override
	public String toString() {
		return "LifeCycleDummy [id=" + id + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");

	}
}
