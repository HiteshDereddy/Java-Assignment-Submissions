import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharStream {
    public static void main(String[] args) {
        String data = "Hello, this is a test.";
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}