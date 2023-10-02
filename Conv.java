public class Conv
{
    public static void main(String[] args)
    {
        // byte b = 127;
        int a = 257;
        byte k = (byte)a;
        System.out.println(k);

        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);

        // type promotion
        byte i =10;
        byte j = 30;
        int result = i*j;
        System.out.println(result);
    }
}


// Explicit Conversion - Casting   b= byte(a)
// Implicit Conversion - Conversion 
