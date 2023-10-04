
class X extends Thread
{
    public void run()
    {   
        for(int i=0;i<100;i++)
            System.out.println("Hi");
            try
            {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
    }
}

class Y extends Thread
{
    public void run()
    {   
        for(int i=0;i<100;i++)
            System.out.println("Hello");
            try
            {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
    }
}

class Threadss
{
    public static void main(String[] args) 
    {
        X obj1 = new X();
        Y obj2 = new Y();

        // System.out.println(obj1.getPriority());

        // obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try
            {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        obj2.start();
    }
}