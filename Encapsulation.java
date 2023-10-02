
// class Human
// {
//     // private int age = 22; // Accessible only in the same class
//     // private String name = "Teja" ;

//     private int age;
//     private String name;

//     public void setAge(int x)
//     {
//         age = x;
//     }

//     public int getAge()
//     {
//         return age;
//     }

//     public void setName(String n)
//     {
//         name = n;
//     }

//     public String getName()
//     {
//         return name;
//     }


// }




// public class Encapsulation 
// {
//     public static void main(String[] args)
//     {
//         Human obj = new Human();
//         // obj.age = 22;
//         // obj.name = "Teja";
//         // System.out.println(obj.name);

//         obj.setAge(22);
//         obj.setName("Teja");

//         System.out.println(obj.getName()+" : "+obj.getAge());
//     }
    
// }



class Human
{
    // private int age = 22; // Accessible only in the same class
    // private String name = "Teja" ;

    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; // Refers to the current object
    }

     

}




public class Encapsulation 
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        // obj.age = 22;
        // obj.name = "Teja";
        // System.out.println(obj.name);

        obj.setAge(22);
        obj.setName("Teja");

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
    
}
