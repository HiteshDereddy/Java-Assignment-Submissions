import java.util.Vector;

class VectorThread extends Thread {
    private Vector<Integer> vector;

    public VectorThread(Vector<Integer> vector) {
        this.vector = vector;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }
    }
}

public class ThreadSafeVector {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new VectorThread(vector);
        Thread t2 = new VectorThread(vector);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Vector: " + vector);
    }
}