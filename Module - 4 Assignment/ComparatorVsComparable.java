import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 90));
        Collections.sort(students);
        System.out.println("Sorted by marks: " + students);

        students.sort(new StudentComparator());
        System.out.println("Sorted by name: " + students);
    }
}