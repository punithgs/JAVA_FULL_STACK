class Th1 extends Thread {
    @Override
    public void run() {
        try {
            JoinThread.t2.join();   // wait for Th2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Th1 : " + i);
        }
    }
}

class Th2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Th2 : " + i);
        }
    }
}
public class JoinThread {
    static Th2 t2;

    public static void main(String[] args) throws InterruptedException {

        Th1 t1 = new Th1();
        t2 = new Th2();   // assign to static variable

        t1.start();
        t2.start();

        t1.join(); // main waits for Th1

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main : " + i);
        }
    }
}

