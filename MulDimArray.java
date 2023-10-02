// class MulDimArray
// {
//     public static void main (String[] args)
//     {
//         int nums[][] = new int[3][4];

//         for(int i=0;i<3;i++)
//         {
//             for (int j=0;j<4;j++)
//             {
//                 nums[i][j]=(int)(Math.random()*10);
//             }
//         }

//         // for(int i=0;i<3;i++)
//         // {
//         //     for(int j=0;j<4;j++)
//         //     {
//         //         System.out.print(nums[i][j] + " ");
//         //     }
//         //     System.out.println();
//         // }

//         for(int n[]:nums) // Enhanced For Loop
//         {
//             for(int m:n)
//             {
//                 System.out.print(m+" ");
//             }
//             System.out.println();
//         }

//     }
// }



class MulDimArray
{
    public static void main (String[] args)
    {
        int nums[][] = new int[3][]; // jagged

        nums[0] = new int[3];
        nums[1]= new int [4];
        nums[2] = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums[i].length;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
            }
        }

        for(int n[]:nums) // Enhanced For Loop
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}


// Array in Java is an object
// Array size is fixed
// Stores same types of elements