package com.sapient.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bo {
	
	   List<Pojo> students = new ArrayList<Pojo>(Arrays.asList(new Pojo[] {new Pojo(1001,"Parveen","Hisar"), new Pojo(1002,"Mayank","Jaipur"),new Pojo(1003,"Aakash","Hisar")}));
    
		public void readStudent() {
			System.out.println("Enter id, name, city of the Students");
			students.add(new Pojo(Integer.parseInt(Read.rd.nextLine()),Read.rd.nextLine(),Read.rd.nextLine()));	
		}
		public void displayStudent() {
			students.stream().forEach(System.out::println);
		}
		public void studentsByCity(String city) {
			students.stream().filter(student -> student.getCity().equals(city)).forEach(System.out :: println);
			
		}
		public void sortByName() {
			students.sort((student1,student2) -> student1.getName().compareTo(student2.getName()));
			students.stream().forEach(System.out :: println);
		}
		public void sortByCity() {
			students.sort((student1,student2) -> student1.getCity().compareTo(student2.getCity()));
			students.stream().forEach(System.out :: println);
		}
		public void studentsById(int id) {
			students.stream().filter(student -> student.getId() == id).forEach(System.out :: println);
		}

}
