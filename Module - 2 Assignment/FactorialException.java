class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class FactorialException {
    public static int factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Factorial of negative number is not allowed.");
        }
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Factorial of -1: " + factorial(-1));
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}