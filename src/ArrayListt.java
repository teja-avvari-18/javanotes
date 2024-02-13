

import  java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static java.util.Collections.*;

public class ArrayListt
{
    public  static  void  main(String[] args)
    {
//        ArrayList al = new ArrayList();
        ArrayList <Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(2,3);

        System.out.println("Size : "+al.size());

        System.out.println("Array: "+al);

        // Removing element
        al.remove(2);

        System.out.println("After removal: "+al);

        // Getting element at a certain index
        System.out.println("Element at index 1: "+al.get(1));


        // Setting value at a certain index
        al.set(1,3);
        System.out.println("New Array: "+al);

        // contains
        System.out.println(al.contains(3));


        // Checks whether array list is empty
        System.out.println(al.isEmpty());




        // Reading elements using for loop

        System.out.println("Reading elements using for loop .....");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        // Accessing array list elements using for each loop
        System.out.println("Reading elements using for each loop .....");
        for(int a:al)
            System.out.println(a);

        // iterator
        System.out.println("Reading elements using iterator .....");

        Iterator it = al.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        // Add all
        ArrayList a2 = new ArrayList();
        a2.addAll(al);
        System.out.println(a2);

        // Remove all
        a2.removeAll(al);
        System.out.println("After Removing: "+a2);

        al.add(0);
        // Sorting array list
        System.out.println("Before Sorting :"+al);
        Collections.sort(al);
        System.out.println("After Sorting:"+al);

        // Sorting in reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements after sorting in reverse order");
        System.out.println(al);

        // Shuffling elements
        Collections.shuffle(al);
        System.out.println("After Shuffling: "+al);

        String arr[] = {"Dog","Cat","Elephant"};
        for(String val:arr)
        {
            System.out.println(val);
        }

        // Convert Array to ArrayList
        ArrayList a1 = new ArrayList(Arrays.asList(arr));
        System.out.println(a1);
    }
}
