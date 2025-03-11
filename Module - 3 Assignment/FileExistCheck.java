import java.io.File;
import java.io.IOException;

public class FileExistCheck {
    public static void main(String[] args) {
        File file = new File("testfile.txt");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created.");
                } else {
                    System.out.println("File creation failed.");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}