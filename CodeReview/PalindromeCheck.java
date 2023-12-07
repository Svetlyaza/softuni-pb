package CodeReview;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        StringBuilder reversedStringBuilder = new StringBuilder(string).reverse();
        String reversed = reversedStringBuilder.toString();
        System.out.printf("%s %s", string, (string.equals(reversed)) ? "is a palindrome." : "is not a palindrome");
    }
}
/* Update:
        Introducing reversedStringBuilder to avoid loops.
        Removed the if statement with ternary operator in the output to shorten the code.
 */

