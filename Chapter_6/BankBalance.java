import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double INTEREST_RATE = 0.03;

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        int choice = input.nextInt();

        if (choice != 1) {
            System.out.println("Okay, no calculation performed.");
            input.close();
            return; // Exit early
        }

        int year = 1;
        balance += balance * INTEREST_RATE;
        System.out.printf("After year %d at %.2f interest rate, balance is %.1f%n", year, INTEREST_RATE, balance);

        System.out.println();
        System.out.println("Do you want to see the balance at the end of another year?");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        choice = input.nextInt();

        if (choice != 1) {
            System.out.println("Thanks for checking your balance!");
            input.close();
            return; // Exit again if user doesn't want to continue
        }

        // You could continue with a loop here if needed...

        input.close();
    }
}