import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it.");

        // Loop until the user guesses the number
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}