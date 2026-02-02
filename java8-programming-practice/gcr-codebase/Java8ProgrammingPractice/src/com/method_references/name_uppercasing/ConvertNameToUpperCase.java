package com.method_references.name_uppercasing;


import java.util.*;

public class ConvertNameToUpperCase {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("akash"),
				new Employee("vivek"),
				new Employee("vansh"));
		
		employeeList.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);
	}
}
