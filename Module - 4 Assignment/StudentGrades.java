import java.util.TreeMap;

public class StudentGrades {
    public static void main(String[] args) {
        TreeMap<String, Character> grades = new TreeMap<>();
        grades.put("Alice", 'A');
        grades.put("Bob", 'B');
        grades.put("Charlie", 'A');

        System.out.println("Grades: " + grades);
    }
}