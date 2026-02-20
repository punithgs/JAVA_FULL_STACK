class MyT1 extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {}
            System.out.println("Child Thread" + i);
        }
    }
}
public class Non_DeamonThread {
    public static void main(String[] args) throws InterruptedException{
        MyT1 t1 = new MyT1();
        t1.setDaemon(true); //Non-Deamon to Deamon
        t1.start();
        for(int i = 1; i <= 10; i++)
        {
            Thread.sleep(1000);
            System.out.println("Main " + i);
            if( i == 6)
                System.out.println(10/0);
        }
    } 
}
