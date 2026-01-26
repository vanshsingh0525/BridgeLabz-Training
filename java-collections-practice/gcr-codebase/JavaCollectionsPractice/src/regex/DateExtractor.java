package regex;

import java.util.Scanner;
import java.util.regex.*;

public class DateExtractor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find())
        {
            System.out.println(m.group());
        }
    }
}
