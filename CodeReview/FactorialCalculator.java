package CodeReview;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a non-negative number: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next();
            }

            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } while (number < 0);
            int result = 1;
            for (int i = 2; i <= number; result *= i, i++) ;
            System.out.println("Factorial: " + result);
    }
}
/* Update:
        Started the cycle at 2 since it doesn't change the multiplication.
        Removed the body of the For loop and added it in the step section, just to cut a line.
        Added input check. It's the most complicated thing here.
        Nothing much to change.
 */