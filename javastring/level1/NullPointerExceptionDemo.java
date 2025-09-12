public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException because text is null
        System.out.println("Length of text: " + text.length());
    }

    // Method to demonstrate handling NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: text is null!");
        }
    }

    public static void main(String[] args) {
        // Call method that generates exception (unhandled)
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: NullPointerException occurred.");
        }

        System.out.println("\nNow demonstrating exception handling inside method:");

        // Call method that handles the exception internally
        handleException();
    }
}
