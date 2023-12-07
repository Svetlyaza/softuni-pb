package CodeReview;

import java.util.Scanner;

public class EvenOddSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        int userInput = scanner.nextInt();
        boolean isEven = userInput % 2 == 0;
        int start = isEven ? 0 : userInput;
        int step = isEven ? 2 : -2;
        for (int i = start; (isEven && i <= userInput) || (!isEven && i >= 1); i += step) {
            System.out.println(i);
        }
    }
}
/* Update:
        I sacrificed readability but at what cost.
        Added input check.
        Added boolean to check if the input is even. Depending on that the loop changes. That way I removed extra loop statement.
 */