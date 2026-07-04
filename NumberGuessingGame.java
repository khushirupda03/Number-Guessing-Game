import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char playAgain;

        do {
            // Generate a new random number for each game
            int secretNumber = rand.nextInt(100) + 1;
            int guess;
            int attempts = 0;

            System.out.println("\n=== Number Guessing Game ===");
            System.out.println("Guess a number between 1 and 100");

            do {
                System.out.print("Enter your Guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("📉 Too Low!");
                } else if (guess > secretNumber) {
                    System.out.println("📈 Too High!");
                } else {
                    System.out.println("\n🎉 Congratulations!");
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                }

            } while (guess != secretNumber);

            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nThanks for playing! 👋");
        sc.close();
    }
}