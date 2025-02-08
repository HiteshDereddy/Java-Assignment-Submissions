
// Checking if a given string or number is a palindrome
import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input = scanner.next();
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not a palindrome");
        scanner.close();
    }
}
