import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        // Input heights
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();

        // Find the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } 
        if (youngestAge == akbarAge) {
            // If there is tie, include all tied friends
            if (youngestFriend.isEmpty()) youngestFriend = "Akbar";
            else youngestFriend += " and Akbar";
        }
        if (youngestAge == anthonyAge) {
            if (youngestFriend.isEmpty()) youngestFriend = "Anthony";
            else youngestFriend += " and Anthony";
        }

        // Find the tallest friend
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } 
        if (tallestHeight == akbarHeight) {
            if (tallestFriend.isEmpty()) tallestFriend = "Akbar";
            else tallestFriend += " and Akbar";
        }
        if (tallestHeight == anthonyHeight) {
            if (tallestFriend.isEmpty()) tallestFriend = "Anthony";
            else tallestFriend += " and Anthony";
        }

        // Output results
        System.out.println("Youngest friend(s): " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend(s): " + tallestFriend + " (Height: " + tallestHeight + " cm)");

        scanner.close();
    }
}
