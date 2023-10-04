
interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, compile, run : Faster");
    }
}

class Developer 
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}


class Impclass
{
    public static void main(String[] args)
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer teja = new Developer();
        teja.devApp(lap);
    }
}