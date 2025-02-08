
// Demonstrating the immutability of the String class
public class StringImmutabilityAgain {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat(" World");

        System.out.println("Original String: " + s1);
        System.out.println("Modified String: " + s2);
    }
}
