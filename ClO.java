
class Calculator
{
    int a;
    public int add(int x, int y)
    {
        int result = x +y ;
        return result;
    }
}


public class ClO 
{
    public static void main(String[] args) 
    {
        int num1 = 4;
        int num2 = 4;

        Calculator calc = new Calculator(); // Creating a new object
        int result = calc.add(num1,num2);
        System.out.println("Result = " +result);
    }
}
