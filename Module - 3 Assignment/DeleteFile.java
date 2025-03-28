import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("delete_me.txt");
        if (file.exists() && file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File not found or deletion failed.");
        }
    }
}