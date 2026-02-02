package com.method_references.name_uppercasing;

public class Employee {
	String name;
	
	public Employee(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
//patientList.stream().map(Patient::getName).map(String::toUpperCase).forEach(System.out::println);