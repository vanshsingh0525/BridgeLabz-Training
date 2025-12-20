import java.util.Scanner;

public class KmToMiles{
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	double km = s.nextDouble();
	//Calculating miles
	double miles =( km * 0.621371);

	//Printing miles
 	System.out.println("The distance " + km + " km in miles is " + 	miles);
}
}