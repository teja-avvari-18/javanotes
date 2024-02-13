
import java.util.LinkedList;
import java.util.*;


public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();

//        LinkedList<Integer> l = new LinkedList<>();

        // add elements
        l.add(100);
        l.add("Welcome");
        l.add(15.5);
        l.add('A');

        System.out.println(l);

        System.out.println("Size: "+l.size());


        // Remove
        l.remove(3);
        l.remove("Welcome");
        System.out.println("After removing new list :"+l);


        // Adding at middle of linkedlist

        l.add(2,"Java");

        System.out.println("After inserting element:"+l);

        // Retrieving the value
        System.out.println(l.get(1));


        // Set
        l.set(0,"Python");
        System.out.println("After changing the value: "+l);


        //contains
        System.out.println(l.contains("Python"));

        //Is Empty
        System.out.println(l.isEmpty());

        // Reading elements using for loop
        System.out.println("The values are : ");
        for(int i=0;i<l.size();i++)
            System.out.println(l.get(i));

        // Reading elements using for each loop
        System.out.println("Reading elements using for each loop");
        for(Object e:l)
            System.out.println(e);

        // Reading data using iterator
        System.out.println("Reading data using iterator");
        Iterator it = l.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        LinkedList a = new LinkedList();
        a.add("X");
        a.add("Y");
        a.add("Z");
        a.add("A");
        a.add("B");
        a.add("C");

        LinkedList b = new LinkedList();
        b.addAll(a);
        System.out.println("New linked list: "+b);

        b.removeAll(a);
        System.out.println("Linked list after removal: "+b);


        // Sorting
        System.out.println("Before sorting: "+a);
        Collections.sort(a);
        System.out.println("After sorting: "+a);

        // Reverse order
        Collections.sort(a,Collections.reverseOrder());
        System.out.println("Reverse order: "+a);

        // Shuffling
        Collections.shuffle(a);
        System.out.println("Data after shuffling: "+a);

        // LinkedList specific operations
        LinkedList an = new LinkedList();
        an.add("dog");
        an.add("dog");
        an.add("cat");
        an.add("horse");
        System.out.println(an);

        // Add first
        an.addFirst("Tiger");

        // Add Last
        an.addLast("Elephant");

        System.out.println("Linked list: "+an);

        System.out.println(an.getFirst()+" "+an.getLast());

        an.removeFirst();
        an.removeLast();

        System.out.println("Linked list after removal: "+an);
    }
}
