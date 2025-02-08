
// Demonstrating method overriding and use of super to call parent class method
class Parent {
    void show() {
        System.out.println("Parent class show()");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // Calling parent class method
        System.out.println("Child class show()");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
