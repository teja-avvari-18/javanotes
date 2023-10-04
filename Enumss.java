

// enum Status
// {
//     Running, Failed, Pending, Success ; // Name Constants
// }


// public class Enumss 
// {
//     public static void main(String[] args) 
//     {
//         // Status s = Status.Running;
//         // System.out.println(s);
//         // System.out.println(s.ordinal());

//         // Status f = Status.Failed;
//         // System.out.println(f);

//         Status[] ss = Status.values();

//         for(Status s: ss)
//         {
//             System.out.println(s+ " : "+s.ordinal());
//         }
//     }
// }


// enum Status
// {
//     Running, Failed, Pending, Success ; // Name Constants
// }


// public class Enumss 
// {
//     public static void main(String[] args) 
//     {
//         Status s = Status.Pending;

//         // if(s==Status.Running)
//         //     System.out.println("All Good");
//         // else if (s==Status.Failed)
//         //     System.out.println("Try Again");
//         // else if (s==Status.Pending)
//         //     System.out.println("Please Wait");
//         // else
//         //     System.out.println("Done");

//         switch(s)
//         {
//             case Running:
//                 System.out.println("All Good");
//                 break;
            
//             case Failed:
//                 System.out.println("Try Again");
//                 break;

//             case Pending:
//                 System.out.println("Please Wait");
//                 break;

//             default:
//                 System.out.println("Done");
//                 break;
//         }
//     }
// }


enum Laptop
{
    Macbook(2000),XPS(2200),Surface,ThinkPad(1800);

    private Laptop()
    {
        price = 500;
    }

    private int price;

    private Laptop(int price) 
    {
        this.price = price;
        System.out.println("In Laptop "+this.name());
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    
}


public class Enumss 
{
    public static void main(String[] args) 
    {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap+ " : "+lap.getPrice());

        for(Laptop lap:Laptop.values())
        {
            System.out.println(lap+ " : "+lap.getPrice());
        }
    }
}
