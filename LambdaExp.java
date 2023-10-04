
// @FunctionalInterface
// interface A
// {
//     // void show();
//     void show(int i);
// }



// public class LambdaExp 
// {
//     public static void main(String[] args)
//     {
//         // A obj = () -> System.out.println("In show");
//         // obj.show();

//         A obj = i -> System.out.println("In Show " + i);
//         obj.show(5);
//     }
// }



@FunctionalInterface
interface A
{
    int add(int i,int j);
}



public class LambdaExp 
{
    public static void main(String[] args)
    {
       A obj = (i,j) ->  i+j;

       int result = obj.add(5, 4);
       System.out.println(result);
    }
}



// Interfaces - Normal, Functional/SAM , Marker