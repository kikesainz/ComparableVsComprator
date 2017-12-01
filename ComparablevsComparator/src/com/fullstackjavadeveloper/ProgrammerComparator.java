package com.fullstackjavadeveloper;

import java.util.Comparator;

public class ProgrammerComparator implements Comparator<Programmer> {

	@Override
	public int compare(Programmer o1, Programmer o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}

}
