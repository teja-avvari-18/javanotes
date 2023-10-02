

class Computer
{
    public void playMusic()
    {
        System.out.println("Playing Music");
    }

    public String getMeaPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        return "Nothing";
    }
}


public class Methods 
{
    public static void main(String[] args) // main - start of exection
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeaPen(2);
        System.out.println(str);

    }
}
