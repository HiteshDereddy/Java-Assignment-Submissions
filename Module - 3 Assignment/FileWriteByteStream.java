import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteByteStream {
    public static void main(String[] args) {
        String data = "Java I/O Streams Example";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}