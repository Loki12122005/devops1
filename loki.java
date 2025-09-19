import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double usdToInr = 83.2;
        double eurToInr = 89.1;
        double usdToEur = 0.93;

        System.out.println("------ Currency Converter ------");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");
        System.out.println("5. USD to EUR");
        System.out.println("6. EUR to USD");
        System.out.print("Choose an option (1-6): ");
        int choice = 2;
        double amount = 2334.0;
        double result = 0;

        switch (choice) {
            case 1:
                result = amount * usdToInr;
                System.out.println(amount + " USD = " + result + " INR");
                break;
            case 2:
                result = amount / usdToInr;
                System.out.println(amount + " INR = " + result + " USD");
                break;
            case 3:
                result = amount * eurToInr;
                System.out.println(amount + " EUR = " + result + " INR");
                break;
            case 4:
                result = amount / eurToInr;
                System.out.println(amount + " INR = " + result + " EUR");
                break;
            case 5:
                result = amount * usdToEur;
                System.out.println(amount + " USD = " + result + " EUR");
                break;
            case 6:
                result = amount / usdToEur;
                System.out.println(amount + " EUR = " + result + " USD");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
