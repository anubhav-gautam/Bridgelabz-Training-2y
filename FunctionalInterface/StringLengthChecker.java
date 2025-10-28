package FunctionalInterface;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        String message = "Hello, this is a test message!";
        int length = getLength.apply(message);

        System.out.println("Message Length: " + length);
        if (length > 25)
            System.out.println("Message exceeds limit!");
        else
            System.out.println("Message within limit.");
    }
}