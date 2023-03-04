import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static Scanner userInputObj = new Scanner(System.in);
    private static boolean numberGuessed;
    private static int noOfGuesses = 0;
    public static void main(String[] args) {

        int userGuess;
        final int secretNumber = ThreadLocalRandom.current().nextInt(1, 99);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (!numberGuessed){
            System.out.println("Okay, turn " + noOfGuesses + " what's your guess? ");
            userGuess = Integer.parseInt(userInputObj.nextLine());
            if (userGuess > secretNumber){
                System.out.println("Oops, try a bit lower");
                noOfGuesses += 1;
            }
            else if (userGuess < secretNumber){
                System.out.println("Too low! Try again");
                noOfGuesses += 1;
            } else {
                System.out.println("Congratulations! You guessed the number, thanks for playing the game!");
                numberGuessed = true;
            }
        }
    }
}