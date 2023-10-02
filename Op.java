class Op
{
    public static void main(String[] args) 
    {
        int num = 7;

        // int num2 = 5;

        // int add = num1 + num2 ;
        // int sub = num1 - num2 ;
        // int mul = num1*num2;
        // int div = num1/num2;
        // int rem = num1%num2;

        // System.out.println(add);
        // System.out.println(sub);
        // System.out.println(mul);
        // System.out.println(div);
        // System.out.println(rem);

        // num1 +=1;
        num++; // Post - Increment
        System.out.println(num);
        num--;
        System.out.println(num);
        System.out.println(++num); // Pre - Increment

        int result = ++num; // Increment the value and fetch the value
        // int result = num++; // Fetch the value and then Increment
        System.out.println(result);
    }
}