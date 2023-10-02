
// Method Overloading

class Calculator
{
    public int add(int x, int y, int z)
    {
        return x + y + z;
    }

    public int add(int x,int y)
    {
        return x+y;
    }

    public double add(double x,double y)
    {
        return x+y;
    }

}


public class MethodOverloading 
{
    public static void main(String[] args) 
    {
        Calculator obj = new Calculator();
        int result =  obj.add(2, 3);
        System.out.println(result);
    }
}
