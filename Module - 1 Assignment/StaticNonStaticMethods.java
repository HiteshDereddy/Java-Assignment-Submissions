
// Demonstrating the use of static and non-static methods
class Utility {
    static int add(int a, int b) {
        return a + b;
    }

    void greet() {
        System.out.println("Hello, welcome!");
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Utility.add(5, 10));

        Utility obj = new Utility();
        obj.greet();
    }
}
