import java.util.HashMap;
import java.util.Scanner;

public class BookCatalog {
    private static HashMap<String, String> catalog = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        catalog.put("The Great Gatsby", "F. Scott Fitzgerald");
        catalog.put("Moby Dick", "Herman Melville");
        catalog.put("1984", "George Orwell");

        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();
        
        System.out.println("Author: " + catalog.getOrDefault(title, "Book not found"));
    }
}