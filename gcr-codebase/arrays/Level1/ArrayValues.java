import java.util.*;

public class ArrayValues{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);

	//Initialize the array
	double arr[] = new double[10];
	double total = 0.0;
	int index = 0;
	while(true){
	     double num = s.nextDouble();
	     if(num <=0 || index == 10){
		break;
	     }
	     arr[index] = num;
	     index++;
	     
	}
	for(int i=0; i<arr.length; i++){
	     System.out.print(arr[i] + " ");
	     total += arr[i];
	}

	//Printing the total sum
	System.out.println(total);
    }
}