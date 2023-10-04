
public class Exceptionss 
{
    public static void main(String[] args) 
    {
        int i = 20;
        int j = 0;
        // String str = null;

        // int nums[] = new int[5];

        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I don't want print zero");
            // System.out.println(str.length() );
            // System.out.println(nums[1]);
            // System.out.println(nums[5]);
        }
        // catch(Exception e)
        // {
        //     System.out.println("Something  went wrong. "+ e);
        // }

        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("That's the default output "+e);
        }

        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Stay in your limit");
        // }
        
        catch(Exception e)
        {
            System.out.println("Something went wrong. "+e);
        }


        System.out.println(j);
        System.out.println("Bye");
    }
}







// Errors - Compile Time Errors, Run Time Errors - Exception Handling , Logical Errors