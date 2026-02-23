class Thread1 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Mythread" + i);
        }
    }
}
public class THreadE1 {
    public static void main(String[] args) {
         
        Thread t = new Thread();
        t.start();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Main" +i);
        }
    }
}