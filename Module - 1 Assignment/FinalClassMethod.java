
// Demonstrating final classes and methods
final class FinalClass {
    final void show() {
        System.out.println("Final method in final class");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
