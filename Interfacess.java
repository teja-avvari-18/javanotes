
interface A // All the methods in interface are Public and Abstract
{
    // int age; // variables are final and static
    // String area;

    int age = 22;
    String area = "Hyderabad";


    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{

}

class B implements A,X
{
    public void show()
    {
        System.out.println("In Show");
    }

    public void config()
    {
        System.out.println("In Config");
    }

    public void run()
    {
        System.out.println("In Run");
    }
}

public class Interfacess 
{
    public static void main(String[] args)
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

    }
}
