class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread 1");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread 2");
            try { Thread.sleep(2000); } catch (InterruptedException e) { }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}