import java.util.Scanner;

public class RandomGuessingGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" - - - Number Guessing Game - - - ");

        int number;
        int noOfAttempts = 0;
        int randomNumber = (int)Math.floor(Math.random() * 100);

        do {
            System.out.print("Guess the number between (1-100): ");
            number = sc.nextInt();

            if(noOfAttempts > 3) break;
            noOfAttempts++;
        } while(randomNumber != number);

        System.out.println("The number is: " + randomNumber);

    }
}
