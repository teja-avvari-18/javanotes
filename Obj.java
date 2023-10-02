

class A
{
    public A()
    {
        System.out.println("Object Created");
    }

    public void show()
    {
        System.out.println("In A Show");
    }
}



public class Obj 
{
    public static void main(String[] args)
    {
        new A().show(); // Anonymous Object
        new A().show(); // Anonymous Object

    }
}
