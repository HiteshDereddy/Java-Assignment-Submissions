class Resource {
    void methodA(Resource res) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked methodA");
            try { Thread.sleep(100); } catch (InterruptedException e) { }
            synchronized (res) {
                System.out.println(Thread.currentThread().getName() + " locked resourceB");
            }
        }
    }
}

public class ThreadDeadlock {
    public static void main(String[] args) {
        Resource res1 = new Resource();
        Resource res2 = new Resource();

        Thread t1 = new Thread(() -> res1.methodA(res2), "Thread 1");
        Thread t2 = new Thread(() -> res2.methodA(res1), "Thread 2");

        t1.start();
        t2.start();
    }
}