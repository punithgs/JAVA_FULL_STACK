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

