
class Calc
{
    public final void show()
    {
        System.out.println("By Teja");
    }

    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("By Ajet");
    }
}




public class Finaal
{
    public static void main(String[] args) 
    {
        // final int num  = 8;
        // num = 9;
        // System.out.println(num);

        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4, 5);
    }
}
