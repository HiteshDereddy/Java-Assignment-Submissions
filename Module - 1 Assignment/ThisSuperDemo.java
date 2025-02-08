
// Demonstrating this and super Keywords
class Parent {
    String name = "Parent";

    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println("Child class display method");
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);
        super.display();
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
