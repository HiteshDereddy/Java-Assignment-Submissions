import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "racecar";
        System.out.println(test + " is palindrome? " + isPalindrome(test));
    }
}