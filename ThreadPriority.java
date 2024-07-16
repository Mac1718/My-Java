class A extends Thread
{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            System.out.println("Hi");
            try 
            {
                Thread.sleep(5);
            } catch (InterruptedException e)
             {
                e.printStackTrace();
             }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            System.out.println("Hello");
            try 
            {
                Thread.sleep(5);
            } catch (InterruptedException e)
             {
                e.printStackTrace();
             }
        }
    }
}


public class ThreadPriority
{
    public static void main(String [] args)
    {
        A obj=new A();
        B obj1=new B();
        obj1.setPriority(5);
        obj.setPriority(6);
        obj.start();
        obj1.start();
    }
}
