import java.io.FileInputStream;
import java.io.IOException;

public class FileReadByteStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}