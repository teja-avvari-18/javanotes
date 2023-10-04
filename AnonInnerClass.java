
class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

// class B extends A
// {
//     public void show()
//     {
//         System.out.println("In B Show");
//     }
// }

public class AnonInnerClass 
{
    public static void main(String[] args) 
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
