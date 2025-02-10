
// Demonstrating Constructors in OOP
class Student {
    String name;

    Student() {
        System.out.println("Default Constructor Called");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Parameterized Constructor Called for " + name);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
    }
}
