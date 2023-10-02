
class Student
{
    int rollno;
    String name;
    int marks;
}



public class Ar 
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollno = 4;
        s1.name ="Raju";
        s1.marks = 54;

        Student s2 = new Student();
        s2.rollno = 44;
        s2.name ="Raj";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 47;
        s3.name ="Raja";
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name+" : " + students[i].marks );
        // }

        for(Student stud:students)
        {
            System.out.println(stud.name+" : " + stud.marks );
        }


        // int nums[] = new int[4];
        // nums[0] = 1;
        // nums[1]=4;
        // nums[2]=5;
        // nums[3]=8;

        // for(int num:nums) // For each loop
        // {
        //     System.out.println(num);
        // }

                

    }
    
}
