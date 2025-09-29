import java.util.Scanner;

public class WeightConversion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" - - - Weight Conversion Program - - - ");

        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        char option = sc.next().charAt(0);

        if (option == '1') {
            System.out.print("Enter weight in lbs: ");
            double weight = sc.nextDouble();

            System.out.printf("Your weight in kgs is: %.2f", (weight *= 0.453592));

        } else if (option == '2') {
            System.out.print("Enter weight in kgs: ");
            double weight = sc.nextDouble();

            System.out.printf("Your weight in lbs is: %.2f", (weight *= 2.20462));
        } else {
            System.out.println("Please try again!");
        }
    }
}
