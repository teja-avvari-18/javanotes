
class Mobile
{
    String brand;
    int price;
    static String name;

    public void show() // Instance Method
    {
        System.out.println(brand+ " : "+price + " : "+ name);
    }

    public static void show1(Mobile obj) // Static Method can directly called by using class name
    {
        System.out.println("In static method");

        // You can use a static variable in a static method but you can't use non static variable in a static method
        // System.out.println(brand+ " : "+price + " : "+ name);

        System.out.println(obj.brand+ " : "+obj.price + " : "+ name);
    }

}



public class StaticMethod 
{
   public static void main(String[] args) 
   {
        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price=150000;
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price=15000;
        Mobile.name = "Smart Phone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        // Mobile.show1();

        Mobile.show1(obj1);
   }
}
