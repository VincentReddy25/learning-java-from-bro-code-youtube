import java.util.Scanner;

public class BankingProgram {
    static Scanner sc = new Scanner(System.in);
    static double money = 0;

    static void showBalance() {
        System.out.printf("Your Balance is: %.2f\n", money);
    }
    static void depositMoney() {
        System.out.print("Enter deposit amount: ");
        int depositAmount = sc.nextInt();

        money += depositAmount;
    }
    static void withdrawMoney() {
        System.out.print("Enter money to withdraw: ");
        int withdrawAmount = sc.nextInt();

        if(money >= withdrawAmount)
            money -= withdrawAmount;
        else
            System.out.println("No enough balance in account");
    }


    public static void main(String[] args) {

        char option;
        boolean isRunning = true;

        System.out.println(" - - - Welcome to the Bank - - - ");

        do {
            System.out.println("\n1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Select an option: ");
            option = sc.next().charAt(0);

            switch (option) {
                case '1':
                    showBalance();
                    break;
                case '2':
                    depositMoney();
                    break;
                case '3':
                    withdrawMoney();
                    break;
                case '4':
                    isRunning = false;
                    System.out.println("Thank you. Please visit again.");
                    break;
                default:
                    System.out.println("Select a valid option.");
            }

        } while (isRunning);
    }
}
