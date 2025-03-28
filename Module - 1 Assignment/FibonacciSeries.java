
// Generating the first n terms of the Fibonacci series
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, temp;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        scanner.close();
    }
}
