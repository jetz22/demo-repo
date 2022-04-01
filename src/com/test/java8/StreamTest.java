package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		//using of stream
		Stream.of(arrayOfEmps);
		empList.stream();
		Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);
		
		//Stream builder
		Stream.Builder<Employee> empStreamBuilder = Stream.builder();

		empStreamBuilder.accept(arrayOfEmps[0]);
		empStreamBuilder.accept(arrayOfEmps[1]);
		empStreamBuilder.accept(arrayOfEmps[2]);

		Stream<Employee> empStream = empStreamBuilder.build();
	}
	private static Employee[] arrayOfEmps = {
		    new StreamTest.Employee(1, "Jeff Bezos", 100000.0), 
		    new StreamTest.Employee(2, "Bill Gates", 200000.0), 
		    new StreamTest.Employee(3, "Mark Zuckerberg", 300000.0)
	};
	
	private static List<Employee> empList = Arrays.asList(arrayOfEmps);

	public static class Employee {
		private String name;
		private double salary;
		private int id;
		
		
		public Employee() {
			super();
		}
		public Employee(int id,String name, double salary) {
			super();
			this.id=id;
			this.name = name;
			this.salary = salary;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
	}


}
