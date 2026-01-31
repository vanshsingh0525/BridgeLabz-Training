package com.lambdaexpressions.smarthomelighting;

public class Main {

	public static void main(String[] args) {
		
		SmartLightSystem system = new SmartLightSystem();
		
		system.addTrigger("motion", () -> System.out.println("Lights ON at full brightness"));
		
		system.addTrigger("night", () -> System.out.println("Dim warm lights activated"));
		
		system.addTrigger("voice", () -> System.out.println("Color lights switched to blue"));
		
		system.execute("motion");
		system.execute("night");
		system.execute("voice");
	}
}
