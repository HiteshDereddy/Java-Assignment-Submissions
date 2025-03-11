import java.io.File;

public class ListFilesDirectory {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}