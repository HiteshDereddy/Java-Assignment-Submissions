
// Demonstrating run-time polymorphism using dynamic method dispatch
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Parent obj = new Child(); // Dynamic method dispatch
        obj.show();
    }
}
