public class LogicOp 
{
    public static void main (String[] args)
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x>y && a>b;
        boolean res = x>y || a>b;
        System.out.println(res);
        System.out.println(!res);
        System.out.println(result);

    }

}
