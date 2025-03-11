import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")) {
            raf.writeUTF("Hello, world!");
            raf.seek(0);
            System.out.println("Read from file: " + raf.readUTF());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}