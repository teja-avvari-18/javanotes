import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();

//        HashSet hs = new HashSet(100);

//        HashSet hs = new HashSet(100,(float) 0.90);

//        HashSet<Integer> hs = new HashSet<>();

        // Add objects/ elements into HashSet
        hs.add(10);
        hs.add("welcome");
        hs.add(16.4);
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

        // remove
        hs.remove(16.4);
        System.out.println("After removing element : "+hs);

        // contains
        System.out.println(hs.contains("welcome"));

        // isEmpty
        System.out.println(hs.isEmpty());

        // Reading objects/ elements
        System.out.println("Reading elements : ");
        for(Object ele:hs)
            System.out.println(ele);

        System.out.println("Printing elements using iterator : ");
        Iterator it = hs.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);

        System.out.println("Hashset : "+evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(10);
        System.out.println("Numbers : "+numbers);

        numbers.removeAll(evenNumber);
        System.out.println("After removal : "+numbers);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Hashset 1: "+set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Hashset 2: "+set2);

        // Union
//        set1.addAll(set2);
//        System.out.println("Union : "+set1);

        // Intersection
//        set1.retainAll(set2);
//        System.out.println("Intersection : "+set1);

        // Difference
//        set1.removeAll(set2);
//        System.out.println("Difference: "+set1);

        // subset
        System.out.println(set1.containsAll(set2));
        System.out.println("Subset : "+set1);
    }
}
