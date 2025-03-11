import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}