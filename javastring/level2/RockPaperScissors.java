import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice (0 = rock, 1 = paper, 2 = scissors)
    public static int getComputerChoice() {
        return (int) (Math.random() * 3);
    }

    // Method to get choice name from int
    public static String choiceToString(int choice) {
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "";
        }
    }

    // Method to find the winner
    // Returns 0 if tie, 1 if user wins, 2 if computer wins
    public static int findWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return 0; // tie
        }

        // Rock beats Scissors
        // Scissors beats Paper
        // Paper beats Rock
        if ((userChoice == 0 && computerChoice == 2) || 
            (userChoice == 2 && computerChoice == 1) || 
            (userChoice == 1 && computerChoice == 0)) {
            return 1; // user wins
        } else {
            return 2; // computer wins
        }
    }

    // Method to calculate average and percentages and return a 2D string array
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][2];

        double userPercent = totalGames == 0 ? 0 : (userWins * 100.0 / totalGames);
        double compPercent = totalGames == 0 ? 0 : (computerWins * 100.0 / totalGames);

        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Winning %";
        stats[2][1] = String.format("User: %.2f%%, Computer: %.2f%%", userPercent, compPercent);

        return stats;
    }

    // Method to display game results and stats
    public static void displayResults(int[] userChoices, int[] compChoices, int[] winners, int totalGames) {
        System.out.printf("%-10s | %-12s | %-10s%n", "Game No", "User Choice", "Computer Choice");
        System.out.println("------------------------------------------");
        for (int i = 0; i < totalGames; i++) {
            System.out.printf("%-10d | %-12s | %-10s%n", 
                              i + 1, 
                              choiceToString(userChoices[i]), 
                              choiceToString(compChoices[i]));
        }

        int userWins = 0, compWins = 0;
        for (int w : winners) {
            if (w == 1) userWins++;
            else if (w == 2) compWins++;
        }

        System.out.println("\nSummary:");
        String[][] stats = calculateStats(userWins, compWins, totalGames);

        for (String[] row : stats) {
            System.out.printf("%-15s : %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine();  // consume newline

        int[] userChoices = new int[totalGames];
        int[] compChoices = new int[totalGames];
        int[] winners = new int[totalGames]; // 0 = tie, 1 = user, 2 = comp

        for (int i = 0; i < totalGames; i++) {
            System.out.printf("Game %d - Enter your choice (rock, paper, scissors): ", i + 1);
            String userInput = scanner.nextLine().toLowerCase();

            int userChoice = -1;
            switch (userInput) {
                case "rock": userChoice = 0; break;
                case "paper": userChoice = 1; break;
                case "scissors": userChoice = 2; break;
                default:
                    System.out.println("Invalid choice! Please enter rock, paper or scissors.");
                    i--;  // redo this iteration
                    continue;
            }

            int computerChoice = getComputerChoice();

            userChoices[i] = userChoice;
            compChoices[i] = computerChoice;
            winners[i] = findWinner(userChoice, computerChoice);
        }

        displayResults(userChoices, compChoices, winners, totalGames);

        scanner.close();
    }
}
