class The1 implements Runnable {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}

public class ThreadRunnableInterface {
    public static void main(String[] args) {

        The1 t1 = new The1();          // Runnable object
        Thread t2 = new Thread(t1);   // Thread with Runnable
        t2.start();                   // start thread
    }
}
