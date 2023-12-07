package CodeReview;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (num2 != 0) ? num1 / num2 : 0;
            default -> {
                System.out.println("Invalid operation");
                yield 0;
            }
        };

        System.out.println("Result: " + result);
    }
}
/* Update:
        Changed the souts so it's more readable for the user.
        Changed the switch syntax so it's shorter.


 */
