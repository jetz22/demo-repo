package com.test.java8;

public class Emp extends ShowInfo {
	private String name;
	private int age;

	public Emp() {
		// super();
	}

	public Emp(String name, int age) {
		// super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void someMethod() {
		System.out.print("some method");
	}

	@Override
	String showDetail() {
		return this.name + String.valueOf(age);
	}

	abstract class ShowInfo {

		abstract String showDetail();
		
		
		public void someMethod() {
			System.out.print("some method");
		}

	}

}
