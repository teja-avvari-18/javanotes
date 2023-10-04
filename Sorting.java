import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;


    public Student(int age, String name) 
    {
        this.age = age;
        this.name = name;
    }


    public String toString() 
    {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}



// public class Sorting 
// {
//     public static void main(String[] args) 
//     {
        
//         Comparator <Integer> com = new Comparator<Integer>() 
//         {
//             public int compare(Integer i,Integer j)
//             {
//                 if(i%10 > j%10)
//                     return 1;
//                 else
//                     return -1;
//             }
//         };

//         List<Integer> nums = new ArrayList<>();
//         nums.add(45);
//         nums.add(31);
//         nums.add(79);
//         nums.add(94);

//         System.out.println(nums);

//         // Collections.sort(nums);
//         Collections.sort(nums,com);

//         System.out.println(nums);



//     }
// }


public class Sorting
{
    public static void main(String[] args) 
    {
        Comparator<Student> com = new Comparator<Student>()
        {
            public int compare(Student i,Student j)
            {
                if(i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };
        

        List <Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Teja"));
        studs.add(new Student(26, "Tejas"));
        studs.add(new Student(28, "Tejaao"));
        studs.add(new Student(23, "Tej"));
        studs.add(new Student(20, "ej"));

        Collections.sort(studs,com);

        for(Student s:studs)
            System.out.println(s);


    }
}
