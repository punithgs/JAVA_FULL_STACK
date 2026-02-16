class Bank{
    int bal;

    public Bank(int bal)
    {
        this.bal = bal;
    } 

    public synchronized void deposit(int amount) {
        System.out.println("Going to deposit");
        bal += amount;
        notify();
        System.out.println("Deposit completed");
    }

    public synchronized void withdraw(int amount) {
        if(amount > bal)
        {
            System.out.println("less bal");
            try{
                wait();
            } catch(InterruptedException e) {}
        }


    }
}


public class InterThreadcommunication {
    public static void main(String[] args) {
        
        Bank b = new Bank(2000);
        new Thread() {
            public void run() {
                b.withdraw(3000);
            }
        }.start();
        new Thread() {
            public void run() {
                b.deposit(5000);
            }
        }.start();
    }
    
}
