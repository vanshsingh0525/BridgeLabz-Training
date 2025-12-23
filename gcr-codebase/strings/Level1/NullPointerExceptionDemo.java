public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will generate NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {

        String text = null;

        try {
            // Accessing String method on null reference
            System.out.println(text.length());
        } 
	catch (NullPointerException e) {
            System.out.println("NullPointerException handled using try-catch.");
        }
    }

    public static void main(String[] args) {

        // Call method to generate exception
        try {
            generateException();
        } 
	catch (NullPointerException e) {
            System.out.println("Exception generated in main method.");
        }

        // Call method to handle exception
        handleException();
    }
}
