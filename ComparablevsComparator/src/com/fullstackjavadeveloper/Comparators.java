package com.fullstackjavadeveloper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Comparators {

	public static void main(String args[]) {

		List employees = new ArrayList<Employee>();

		employees.add(new Employee(35, "Monica", 2000));
		employees.add(new Employee(366, "Pedro", 1000));
		employees.add(new Employee(232, "Silvia", 1500));

		System.out.println("Lista sin ordenar de Employees: \n" + employees.toString());

		Collections.sort(employees);

		System.out.println("Lista ordenada de Employees: \n" + employees.toString());

		List programmers = new ArrayList<Programmer>();
		programmers.add(new Programmer(35, "Monica", 35));
		programmers.add(new Programmer(366, "Pedro", 30));
		programmers.add(new Programmer(232, "Silvia", 55));

		System.out.println("Lista sin ordenar de programmers: \n" + programmers.toString());

		Collections.sort(programmers, new ProgrammerComparator());

		System.out.println("Lista ordenada de programmers: \n" + programmers.toString());

		List managers = new ArrayList<Manager>();
		managers.add(new Manager(35, "Monica", 2000, 35));
		managers.add(new Manager(366, "Pedro", 3000, 44));
		managers.add(new Manager(232, "Silvia", 1500, 40));

		System.out.println("Lista sin ordenar: \n" + managers.toString());

		Collections.sort(managers, new SortManagById());

		System.out.println("Lista ordenada por Wage: \n" + managers.toString());

		Collections.sort(managers, new SortManagByWage());

		System.out.println("Lista ordenada por Wage: \n" + managers.toString());
		List person = new ArrayList<Person>();
		person.add(new Programmer(300, "Pedro", 20));
		person.add(new Manager(354, "Monica", 2000, 35));
		person.add(new Programmer(355,"Silvia", 50));
		

		System.out.println("Lista sin ordenar de Person: \n " + person.toString());


		Collections.sort(person, new SortProgrManag());
		
		System.out.println("Lista ordenada por edad de Person: \n" + person.toString());

	}

}
