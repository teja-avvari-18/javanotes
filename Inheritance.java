
class Calc
{
    public int add(int x,int y)
    {
        return x+y;
    }

    public int sub(int x, int y)
    {
        return x-y;
    }
}

class AdvCalc extends Calc
{
    public int mul(int x,int y)
    {
        return x*y;
    }

    public int div(int x,int y)
    {
        return x/y;
    }
}

class ScientificCalc extends AdvCalc
{
    public double power(int x, int y)
    {
        return Math.pow(x, y);
    }
}


public class Inheritance 
{
    public static void main(String[] args) 
    {
        ScientificCalc obj = new ScientificCalc();
        int addRes = obj.add(4, 5);
        int subRes = obj.sub(5, 4);
        int mulRes = obj.mul(5, 4);
        int divRes = obj.div(80, 16);
        int powRes = (int) obj.power(5, 2);

        System.out.println("Addition = " + addRes);
        System.out.println("Subtraction = " + subRes);
        System.out.println("Multiplication = "+mulRes);
        System.out.println("Division = "+divRes);
        System.out.println("Power : "+powRes);
    }
}


// Multiple Inheritance cannot work in Java