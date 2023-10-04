
abstract class Car // Cannot create an object of abstract class
{
    public abstract void drive();
    public abstract void fly();
    

    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

class WagnoR extends Car
{
    public void drive()
    {
        System.out.println("Driving");
    }

    public void fly()
    {
        System.out.println("Flying");
    }
}

public class Abstractt 
{
    public static void main(String[] args) 
    {
        Car obj = new WagnoR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
