import java.util.Scanner;
import java.util.InputMismatchException;

public class DebugSix2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int a;
        int min;
        final int MAX = 122;
        final int NUMBERLINE = 20;
        int lines = 0;

        System.out.println("Enter a Unicode value to start.");
        System.out.print("For example, A is 65 >> ");

        while (!keyboard.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number like 65.");
            keyboard.next();
            System.out.print("Try again >> ");
        }
        min = keyboard.nextInt();

        for (a = min; a <= MAX; a++) {
            letter = (char) a;
            System.out.print(" " + letter);
            lines++;

            if (lines == NUMBERLINE) {
                lines = 0;
                System.out.println();
            }
        }

        System.out.println("\nEnd of application");
    }
}