class DaemonExample extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon Thread Running");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }

    public static void main(String[] args) {
        DaemonExample dt = new DaemonExample();
        dt.setDaemon(true);
        dt.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread Running");
            try { Thread.sleep(2000); } catch (InterruptedException e) { }
        }
    }
}