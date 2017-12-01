package com.fullstackjavadeveloper;

public class Manager implements Person {
	Integer id;
	String name;
	Integer wage;
	Integer age;

	public Manager(Integer id, String name, Integer wage, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.wage = wage;
		this.age = age;
	}

	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", Wage=" + wage + ", age=" + age + "]";
	}

	public int getAge() {
		return this.age;
	};

}
