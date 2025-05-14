import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int difficulty = 0;
        int attempts = 0;
        int choice;
        int randomNumber = random.nextInt(1, 101);


        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("I'm thinking at a number between 1 and 100.");
        System.out.println();
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        System.out.println();
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice){
            case 1 -> {
                System.out.println("Great! You have selected the Easy difficulty level.");
                difficulty = 10;
            }
            case 2 -> {
                System.out.println("Great! You have selected the Medium difficulty level.");
                difficulty = 5;
            }
            case 3 -> {
                System.out.println("Great! You have selected the Hard difficulty level.");
                difficulty = 3;
            }
            default -> System.out.println("This is not a choice!");
        }
        System.out.println("Let's start the game!");

        do {
            if (attempts == difficulty){
                System.out.println("You have reached the number of choices!");
                break;
            }
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

            if (guess > randomNumber){
                System.out.println("Incorrect! The number is less than " + guess);
            } else if (guess < randomNumber) {
                System.out.println("Incorrect! The number is greater than " + guess);
            }
            else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }

        } while (guess != randomNumber);
        scanner.close();
    }
}
