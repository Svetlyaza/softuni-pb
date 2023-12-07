package CodeReview;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i+= 2) {
            sum += i;
        }
        System.out.printf("Sum of even numbers: %d", sum);
    }
}
/* Update:
        Changed for loop statement in order to get rid of odd numbers and extra loops.
 */