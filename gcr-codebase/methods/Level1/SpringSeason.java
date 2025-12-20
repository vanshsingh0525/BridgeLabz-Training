public class SpringSeason {

    // Method to check whether the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        } 
	
            return false;
        
    }

    public static void main(String[] args) {
        // Get month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call the method to check Spring Season
        boolean result = isSpringSeason(month, day);

        // Display the result
        if (result) {
            System.out.println("Its a Spring Season");
        } 
	else {
            System.out.println("Not a Spring Season");
        }
    }
}
