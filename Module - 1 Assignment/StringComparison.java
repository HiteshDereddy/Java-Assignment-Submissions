
// Difference between == and equals() for string comparison
public class StringComparison {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";

        System.out.println("s1 == s2: " + (s1 == s2)); // False, different objects
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // True, same value
        System.out.println("s3 == s4: " + (s3 == s4)); // True, same string pool reference
    }
}
