
// Checking if a number is prime using a while loop
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("Not a prime number");
        } else {
            int i = 2;
            boolean isPrime = true;
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            System.out.println(isPrime ? "Prime number" : "Not a prime number");
        }

        scanner.close();
    }
}
