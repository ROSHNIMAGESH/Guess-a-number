import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate a random number
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int userGuess = 0;
        boolean hasGuessedCorrectly = false;

        // Game instructions
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have randomly selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until the user guesses the correct number
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly in " + numberOfTries + " tries.");
                hasGuessedCorrectly = true;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
