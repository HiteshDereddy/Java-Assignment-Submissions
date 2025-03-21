import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task 2. Remove Task 3. Display Tasks 4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter task:");
                    tasks.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Enter index to remove:");
                    tasks.remove(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Tasks: " + tasks);
                    break;
                case 4:
                    return;
            }
        }
    }
}