class StopThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        for (int i = 1; i <= 100 && running; i++) {
            System.out.println(i);
            try { Thread.sleep(100); } catch (InterruptedException e) { }
        }
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        StopThread thread = new StopThread();
        thread.start();
        Thread.sleep(2000);
        thread.stopThread();
    }
}