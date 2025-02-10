
// Counting the frequency of characters in a string
import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies: " + frequency);
        scanner.close();
    }
}
