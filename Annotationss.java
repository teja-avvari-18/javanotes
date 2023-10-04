
class X
{
    public void showDatass()
    {
        System.out.println("In X Show");
    }
}

class Y extends X
{   
    @Override
     public void showDatass()
    {
        System.out.println("In Y Show");
    }
}




public class Annotationss 
{
    public static void main(String[] args)
    {
        Y obj = new Y();
       obj.showDatass();
    }
}
