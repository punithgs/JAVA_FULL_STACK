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


