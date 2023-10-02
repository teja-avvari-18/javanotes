public class Literals 
{
    public static void main(String[] args)
    {
        int num1 = 0b101;
        System.out.println(num1);

        int num = 0x7E;
        System.out.println(num);

        int num2 = 10_000;
        System.out.println(num2);

        double n = 56; // Converts Integer value to double
        System.out.println(n);

        double ne = 12e10;
        System.out.println(ne);

        char c = 'a';
        System.out.println(c);
        c++;
        System.out.println(c);
        ++c;
        System.out.println(c);
        c--;
        System.out.println(c);
        System.out.println(--c);
        System.out.println(--c);
        c++;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}
