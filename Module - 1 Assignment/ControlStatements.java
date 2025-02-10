
// Demonstrating if-else, switch, and for loop
import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        switch (num) {
            case 1:
                System.out.println("You entered one");
                break;
            case 2:
                System.out.println("You entered two");
                break;
            default:
                System.out.println("Other number");
        }

        System.out.println("Counting to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
