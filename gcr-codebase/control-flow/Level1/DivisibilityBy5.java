import java.util.Scanner;

public class DivisibilityBy5{
     public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//Taking number as input
	int number = sc.nextInt();
	//Checking divisibility
	Boolean ans = number%5 == 0;

	//Printing result
	if(ans){
	System.out.println("Is the number " + number + " divisible by 5? " + ans);
}
}
}