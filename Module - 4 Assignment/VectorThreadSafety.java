import java.util.*;

public class VectorThreadSafety {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                vector.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Vector size: " + vector.size());
    }
}