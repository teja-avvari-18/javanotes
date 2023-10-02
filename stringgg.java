

public class stringgg 
{
    public static void main(String[] Args)
    {
        // Strings are Immutable and String Builder, String Buffer are mutable
        // Mutable - change , Immutable - unchange
        // String name = new String("Teja") ; // String is a class
        String name = "teja"; // this goes to garbage collection
        name = name + "avvari" ; // creating a new object
        System.out.println(name);
        // System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat("Avvari"));

        String s1 = "Teja";
        String s2 = "Teja";
        System.out.println(s1==s2);

    }
    
}
