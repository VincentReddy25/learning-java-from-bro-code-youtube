import java.util.Scanner;

public class TemperatureConvertor {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" - - - Temperature Converter - - - ");

        System.out.print("Convert to celsius or fahrenheit(c or f): ");
        String option = sc.next().toUpperCase();

        System.out.print("Enter current temperature: ");
        double currentTemperature = sc.nextDouble();

        //        Still there is an error in this code
        double newTemperature = (option.equals("C")) ?
                (currentTemperature - 32) * 5 / 9 :
                (currentTemperature * 5 / 9) + 32;

        System.out.printf("Your temperature is: %.1f%s", newTemperature, option);

    }
}
