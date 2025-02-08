
// Demonstrating Final Keyword in Java
final class FinalClass {
    final int finalVar = 10;

    final void display() {
        System.out.println("Final Method: " + finalVar);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
