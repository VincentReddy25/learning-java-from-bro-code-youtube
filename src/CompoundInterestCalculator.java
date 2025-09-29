import java.util.Scanner;

public class CompoundInterestCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double finalAmount = 0;

        System.out.print("Enter principle amount: ");
        double principleAmount = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rateOfInterest = sc.nextDouble();

        System.out.print("How many times in a year: ");
        double timesCompounded = sc.nextDouble();

        System.out.print("Number of years: ");
        double noOfYears = sc.nextDouble();

        finalAmount = principleAmount * Math.pow(1 + rateOfInterest / timesCompounded, timesCompounded * noOfYears);

        System.out.printf("Your Final Amount after %.1f year is: %.2f", noOfYears, finalAmount);
    }
}

