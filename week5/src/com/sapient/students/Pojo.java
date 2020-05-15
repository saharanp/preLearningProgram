package com.sapient.students;

public class Pojo {
	
	private int id;
	private String name;
	private String city;
	
	
//constructor
	public Pojo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	

//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
