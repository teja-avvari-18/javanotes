
class Human
{
    private int age;
    private String name;

    public Human () // Constructor never returns anything 
    {
        age = 12;  // Default Constructor
        name = "Teja";
    }

    public Human(int age,String name) // Parameterized Constructor
    {
        this.age = age;
        this.name = name;
    }

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
        this.name = name;
    }


    
}




class Constructor
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        Human obj1 = new Human(23, "Teja");
        System.out.println(obj1.getName()+" : "+obj1.getAge());

        // obj.setAge(23);
        // obj.setName("Teja");
        System.out.println(obj);
    }
}