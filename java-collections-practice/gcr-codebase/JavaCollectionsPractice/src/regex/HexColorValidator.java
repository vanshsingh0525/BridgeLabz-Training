package regex;

import java.util.Scanner;
import java.util.regex.*;

public class HexColorValidator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();

        String regex = "^#[A-Fa-f0-9]{6}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(color);

        if (m.matches())
            System.out.println("Valid hex color");
        else
            System.out.println("Invalid hex color");
    }
}
