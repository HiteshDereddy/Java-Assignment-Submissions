import java.util.*;
import java.util.concurrent.*;

public class SynchronizedCollectionVsConcurrentHashMap {
    public static void main(String[] args) {
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        syncList.add(1);
        concurrentMap.put(1, "One");

        Runnable task1 = () -> {
            synchronized (syncList) {
                syncList.add(2);
            }
        };

        Runnable task2 = () -> concurrentMap.put(2, "Two");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronized List: " + syncList);
        System.out.println("ConcurrentHashMap: " + concurrentMap);
    }
}