import java.util.Scanner;

public class RPSgame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String[] options = {"rock", "paper", "scissors"};
        int randomNumber = (int)Math.floor(Math.random() * 3);
        String systemOption = options[randomNumber];

        System.out.println(" - - - Rock Paper Scissors - - - ");

        System.out.println("Select an option (rock, paper or scissors): ");
        String userOption = sc.next().toLowerCase();

        if (userOption.equals(systemOption)) {
            System.out.println("It's a draw!");
        }
        else if (
                (userOption.equals("rock") && systemOption.equals("scissors")) ||
                        (userOption.equals("paper") && systemOption.equals("rock")) ||
                        (userOption.equals("scissors") && systemOption.equals("paper"))
        ) {
            System.out.println("You win!");
        }
        else if (
                (userOption.equals("rock") && systemOption.equals("paper")) ||
                        (userOption.equals("paper") && systemOption.equals("scissors")) ||
                        (userOption.equals("scissors") && systemOption.equals("rock"))
        ) {
            System.out.println("System wins!");
        }
        else {
            System.out.println("Invalid input! Please choose rock, paper, or scissors.");
        }


    }
}
