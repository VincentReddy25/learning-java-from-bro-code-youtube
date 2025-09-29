import java.util.Scanner;

public class SimpleCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" - - - Simple Calculator - - - ");

        System.out.print("Enter first number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Select an operand(+, -, *, /): ");
        char operand = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double secondNumber = sc.nextDouble();

        switch (operand) {
            case '+':
                System.out.printf("Addition of %.1f and %.1f is: %.1f", firstNumber, secondNumber, (firstNumber + secondNumber));
                break;
            case '-':
                System.out.printf("Subtraction of %.1f and %.1f is: %.1f", firstNumber, secondNumber, (firstNumber - secondNumber));
                break;
            case '*':
                System.out.printf("Multiplication of %.1f and %.1f is: %.1f", firstNumber, secondNumber, (firstNumber * secondNumber));
                break;
            case '/':
                System.out.printf("Division of %.1f and %.1f is: %.1f", firstNumber, secondNumber, (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Please select a valid option!");
        }
    }
}
