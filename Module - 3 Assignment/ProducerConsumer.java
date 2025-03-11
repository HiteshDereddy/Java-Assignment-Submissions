import java.util.LinkedList;

class SharedResource {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) wait();
        list.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (list.isEmpty()) wait();
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    resource.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) { }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    resource.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) { }
        });

        producer.start();
        consumer.start();
    }
}