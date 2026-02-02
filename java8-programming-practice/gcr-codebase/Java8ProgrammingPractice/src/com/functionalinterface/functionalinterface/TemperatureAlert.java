package com.functionalinterface.functionalinterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TemperatureAlert {
	
	public static void main(String[] args) {
		
		List<Double> temperature = Arrays.asList(45.9, 33.5, 66.89, 99.9);
		double threshold = 56;
		
		Predicate<Double> check = (temp) -> temp > threshold; 
		
		for(Double t : temperature) {
			if(check.test(t)) {
				 System.out.println("ALERT! Temperature crossed: " + t);
			}
		}
	}

}