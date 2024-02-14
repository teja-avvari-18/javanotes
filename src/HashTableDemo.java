import java.util.*;
import  java.util.Map.Entry;


public class HashTableDemo
{
    public static void main(String[] args)
    {
//        Hashtable t = new Hashtable(); // Capacity - 11, load factor - 0.75
        Hashtable<Integer,String> t = new Hashtable<>();

        t.put(101,"John");
        t.put(102,"David");
        t.put(103,"Smith");
//        t.put(null,"X"); // NullPointerException
//        t.put(104,"Harry"); // NullPointerException


        System.out.println(t);

        System.out.println(t.get(103));

        t.remove(103);
        System.out.println("After removing : "+t);

        System.out.println(t.containsKey(102));
        System.out.println(t.containsValue("John"));

        System.out.println(t.isEmpty());

        System.out.println("Keys : "+t.keySet());
        System.out.println("Values : "+t.values());

        for (int k:t.keySet())
        {
            System.out.println(k+" "+t.get(k));
        }

        for(Map.Entry entry:t.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        Set s = t.entrySet();

        Iterator itr = s.iterator();

        while (itr.hasNext())
        {
            Map.Entry entry = (Entry) itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
