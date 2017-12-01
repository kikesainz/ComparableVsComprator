package com.fullstackjavadeveloper;

import java.util.Comparator;

public class Programmer implements Person {
	Integer id;
	String name;
	Integer age;

	public Programmer(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Programmer(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
