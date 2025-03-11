import java.io.FileReader;
import java.io.IOException;

public class FileReadCharStream {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}