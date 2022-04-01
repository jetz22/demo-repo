package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaTest {

	public static void main(String[] args) {

		List<Emp> fullList = new ArrayList<>();
		fullList.add(new Emp("emp8",20));
		fullList.add(new Emp("emp9",19));
		fullList.add(new Emp("emp10",22));
		fullList.add(new Emp("emp11",24));
		fullList.add(new Emp("emp12",31));
		
		fullList.get(0).someMethod();

//		List<String> collectorCollection = 
//				fullList.stream().map(Emp::getName).filter().collect(Collectors.toList());
		
		Map<Boolean, List<Emp>> mapPartioned = fullList.stream()
				  .collect(Collectors.partitioningBy(element -> element.getAge() > 20));
		//mapPartioned.forEach((s) -> System.out.println(s.));
	}


	
}
