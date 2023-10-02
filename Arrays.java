public class Arrays
{
    public static void main(String[] args) 
    {
        // int num [] = {4,5,6,7};
        // int num1[] = new int [4];

        // int nums [] = {3,7,2,4}; // Static Array
        // System.out.println(nums[1]);
        // nums[1] = 6;
        // System.out.println(nums[1]);
        // System.out.println(nums[0]);

        int nums[] = new int[4];
        nums[0] = 1;
        nums[1]=4;
        nums[2]=5;
        nums[3]=8;
        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[3]);

        for(int i=0;i<4;i++)
        {
            System.out.println(nums[i]);
        }

    }
}