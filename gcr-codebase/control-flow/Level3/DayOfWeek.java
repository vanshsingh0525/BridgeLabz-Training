public class DayOfWeek {
    public static void main(String[] args) {

        // Read command-line arguments
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year
        // Apply given formulas
        double y0 = y - (14 - m) / 12;
        double x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        double m0 = m + 12 * ((14 - m) / 12) - 2;
        double d0 = (d + x + 31 * m0 / 12) % 7;

        // Print day of the week
        System.out.println("Day of the week is: " + (int)d0);
    }
}
