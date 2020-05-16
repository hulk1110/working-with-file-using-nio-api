package com.nish.model;

public class Person {
	private String name;
	
	private int age;
	private String city;


	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", city=" + city + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
