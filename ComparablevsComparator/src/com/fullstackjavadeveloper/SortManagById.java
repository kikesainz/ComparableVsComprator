package com.fullstackjavadeveloper;

import java.util.Comparator;

public class SortManagById implements Comparator <Manager>{

	@Override
	public int compare(Manager m1, Manager m2) {
	
		return m1.id - m2.id;
	}

}
