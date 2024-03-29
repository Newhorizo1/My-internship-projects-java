
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between " + minRange + " and " + maxRange + ".");
        System.out.println("Can you guess what it is?");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("Too high! Try again.");
            }
       }
    }
}
    