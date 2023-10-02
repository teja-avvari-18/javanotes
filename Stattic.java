
class Mobile
{
    String brand; // Instance Variables
    int price;
    static String name; // common to all objects
    // Making something class member not an object member
    // Static variables should be called with their class names

    static
    {
        name = "Phone";
        System.out.println("In Static block");
    }

    public Mobile() // Constructor
    {
        brand = " ";
        price = 20000;
        System.out.println("In Constructor");
    }

    public void show()
    {
        System.out.println(brand+ " : "+price + " : "+ name);
    }
}




class Stattic
{
    public static void main(String[] args) throws ClassNotFoundException
    {

        Class.forName("Mobile"); // Loads your class

        // Mobile obj1 = new Mobile();
        // obj1.brand ="Apple";
        // obj1.price=150000;
        // Mobile.name = "Smart Phone";

        // Mobile obj2 = new Mobile();
        // obj2.brand ="Samsung";
        // obj2.price=15000;
        // Mobile.name = "Smart Phone";

        // Mobile.name = "Phone";

        // obj1.show();
        // obj2.show();
    }
}