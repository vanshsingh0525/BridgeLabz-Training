package regex;

import java.util.Scanner;
import java.util.regex.*;

public class LicensePlateValidator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter license plate number: ");
        String plate = sc.nextLine();

        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(plate);

        if (m.matches())
            System.out.println("Valid license plate");
        else
            System.out.println("Invalid license plate");
    }
}
