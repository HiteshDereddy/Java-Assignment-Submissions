
// Splitting a string into words and printing each word on a new line
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
