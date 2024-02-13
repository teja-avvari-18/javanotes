import javax.management.ObjectName;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import  java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args)
    {
        HashMap<Integer,String > hm = new HashMap<>();

        hm.put(101,"John");
        hm.put(102,"David");
        hm.put(103,"Scott");
        hm.put(104,"Mary");
        hm.put(105,"Tye");
        hm.put(103,"Mark");

        System.out.println(hm);

        System.out.println(hm.get(105));

        hm.remove(103); // Remove pair from hashmap
        System.out.println(hm);

        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("Mary"));

        System.out.println(hm.isEmpty());

        System.out.println("Keys are : "+hm.keySet());
        System.out.println("Values are : "+hm.values());

        System.out.println(hm.entrySet()); // Returns all the entries as set

        for(int i: hm.keySet())
            System.out.println(i);

        for(Object i: hm.keySet())
            System.out.println(i);


        for(Object i: hm.values())
            System.out.println(i);

        for(Object e:hm.keySet())
            System.out.println(e+" "+hm.get(e));

        // Entry Methods
        for(Map.Entry<Integer,String> e:hm.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }


        // Iterator
        Set s= hm.entrySet();

        Iterator it = s.iterator();

        while (it.hasNext())
        {
            Map.Entry entry = (Entry) it.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
