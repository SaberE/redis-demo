package com.jedis.demo.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;


@Component
public class User implements Serializable {
	
	private String name;
	
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
