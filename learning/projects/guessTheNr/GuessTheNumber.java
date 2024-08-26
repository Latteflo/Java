
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int highScore = 0;

        while (playAgain) {
            System.out.println("Select difficulty level:");
            System.out.println("1. Easy (1-50, 10 attempts)");
            System.out.println("2. Medium (1-100, 7 attempts)");
            System.out.println("3. Hard (1-200, 5 attempts)");
            int difficulty = scanner.nextInt();
            int range = 0;
            int maxAttempts = 0;

            switch (difficulty) {
                case 1:
                    range = 50;
                    maxAttempts = 10;
                    break;
                case 2:
                    range = 100;
                    maxAttempts = 7;
                    break;
                case 3:
                    range = 200;
                    maxAttempts = 5;
                    break;
                default:
                    System.out.println("Invalid choice, defaulting to Medium.");
                    range = 100;
                    maxAttempts = 7;
            }

            int numberToGuess = random.nextInt(range) + 1;
            int numberOfTries = 0;
            int score = 1000;
            boolean hasWon = false;
            boolean shouldContinue = true;

            System.out.println("I've picked a number between 1 and " + range + ". Try to guess it!");

            while (shouldContinue && numberOfTries < maxAttempts) {
                System.out.print("Enter your guess (or type '0' to quit): ");
                int guess = scanner.nextInt();
                numberOfTries++;

                if (guess == 0) {
                    shouldContinue = false;
                    System.out.println("Thanks for playing! The number was " + numberToGuess + ".");
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    hasWon = true;
                    shouldContinue = false;
                    System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                    break;
                }

                score -= 100; // Decrease score with each incorrect guess

                // Provide a hint after half the maximum attempts
                if (numberOfTries == maxAttempts / 2) {
                    if (numberToGuess % 2 == 0) {
                        System.out.println("Hint: The number is even.");
                    } else {
                        System.out.println("Hint: The number is odd.");
                    }
                }
            }

            if (hasWon) {
                if (score > highScore) {
                    highScore = score;
                    System.out.println("New high score: " + highScore + "!");
                } else {
                    System.out.println("Your score: " + score);
                }
            } else {
                System.out.println("Out of attempts! The number was " + numberToGuess + ".");
            }

            System.out.print("Would you like to play again? (y/n): ");
            char playAgainChoice = scanner.next().charAt(0);
            if (playAgainChoice != 'y') {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Your highest score was: " + highScore);
        scanner.close();
    }
}

