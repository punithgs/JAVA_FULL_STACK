class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(2000); // 2 seconds
                System.out.println("Thread1 " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SleepThread {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t = new Thread1();
        t.start();

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(5000); // 10 seconds
            System.out.println("main " + i);
        }
    }
}
