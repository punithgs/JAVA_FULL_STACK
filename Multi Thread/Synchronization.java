class A {
    public static synchronized void m1(String s) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Executed by : " + s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class MyTh extends Thread {
    A a;
    String s;

    public MyTh(A a, String s) {
        this.a = a;
        this.s = s;
    }

    @Override
    public void run() {
        a.m1(s);
    }
}

public class Synchronization {
    public static void main(String[] args) {

        A a = new A();
        A a1 = new A();

        MyTh t1 = new MyTh(a, "T1");
        MyTh t2 = new MyTh(a1, "T2");

        t1.start();
        t2.start();
    }
}
