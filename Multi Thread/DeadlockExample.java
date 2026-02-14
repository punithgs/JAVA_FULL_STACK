class Resource1 {
    synchronized void method1(Resource2 r2) {
        System.out.println(Thread.currentThread().getName() + " locked Resource1");
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        r2.method2();
    }

    synchronized void method2() {
        System.out.println("Inside Resource1 method2");
    }
}

class Resource2 {
    synchronized void method1(Resource1 r1) {
        System.out.println(Thread.currentThread().getName() + " locked Resource2");
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        r1.method2();
    }

    synchronized void method2() {
        System.out.println("Inside Resource2 method2");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {

        Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();

        Thread t1 = new Thread(() -> {
            r1.method1(r2);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            r2.method1(r1);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
