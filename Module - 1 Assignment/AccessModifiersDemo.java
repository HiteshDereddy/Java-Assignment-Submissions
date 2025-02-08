
// Demonstrating Access Modifiers in Java
class Test {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;
    int defaultVar = 40;

    void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
