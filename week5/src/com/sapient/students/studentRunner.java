package com.sapient.students;

public class studentRunner {
	
	public static void main(String[] args) {
		
		Bo obj = new Bo();
		
		obj.readStudent();
		obj.displayStudent();
		obj.studentsByCity("Hisar");
		obj.sortByName();
		obj.sortByCity();
		obj.studentsById(1001);
		
	}
}

