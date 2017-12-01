package com.fullstackjavadeveloper;

public class Employee implements Comparable <Employee>{
	
	Integer id;
	String name;
	Integer wage;
	
	public Employee(Integer id, String name, Integer wage) {
		this.id = id;
		this.name = name;
		this.wage = wage;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", wage=" + wage + "]";
	}


	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return    emp.id - this.id;
	}

}


