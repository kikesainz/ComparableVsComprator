package com.fullstackjavadeveloper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortManagByWage implements Comparator<Manager> {

	@Override
	public int compare(Manager m1, Manager m2) {

		return m1.wage - m2.wage;
	}

}
