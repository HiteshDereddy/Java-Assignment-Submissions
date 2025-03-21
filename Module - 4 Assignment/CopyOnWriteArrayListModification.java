import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListModification {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Runnable task = () -> {
            for (Integer i : list) {
                list.add(i + 10);
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

        System.out.println("Updated CopyOnWriteArrayList: " + list);
    }
}