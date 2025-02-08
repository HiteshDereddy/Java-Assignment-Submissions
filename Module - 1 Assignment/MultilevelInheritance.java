
// Demonstrating multilevel inheritance in Java
class Grandparent {
    void show() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
        obj.print();
    }
}
