package com.sapient.employe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddEmploye {
	
	List<Employe> list = new ArrayList<Employe>(Arrays.asList(new Employe(1,"wdwfg","sdfvgb")));
	
	void addEmploye(Employe emp) {
		if (emp == null)
			throw new IllegalArgumentException();
		list.add(emp);
	}
	
	Employe getEmploye(int id) {
		
		if (id<0)
			throw new IllegalArgumentException();
		for(Employe emp : list) {
			if(emp.getId() == id)
				return emp;
		}
		return null;
	}	
	
}
