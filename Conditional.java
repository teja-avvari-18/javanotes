// public class Conditional 
// {
//     public static void main (String[] args)
//     {
//         // int x = 28;
        
//         // if(x>10 && x<=20 )
//         // {
//         //     System.out.println("Hello");
//         // }
//         // else
//         // {
//         //     System.out.println("Bye");
//         // }
        
//         // if (x>10 && x<=20)
//         //     System.out.println("Hello");
//         // else
//         //     System.out.println("Bye");

//         int x = 8;
//         int y = 17;
//         int z = 9;

//         if(x>y && x>z)
//         {
//             System.out.println(x);
//         }
//         else if(y>x && y>z)
//         {
//             System.out.println(y);
//         }
//         else
//         {
//             System.out.println(z);
//         }
//     }
// }


// class Conditional
// {
//     public static void main(String [] args)
//     {
//         int n = 4;

//         if(n%2==0)
//         {
//             System.out.println("It is even");   
//         }
//         else
//         {
//             System.out.println("It is odd");
//         }
//     }
// }


// class Conditional
// {
//     public static void main(String[] args)
//     {
//         int n = 5;
//         int result = 0;

//         result = n%2==0 ? 10 :20 ;
//         System.out.println(result);
//     }
// }


class Conditional
{
    public static void main(String[] args) 
    {
        int n = 7 ;

        switch(n)
        {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesay");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                 System.out.println("Enter a valid number");
        }
    }
}