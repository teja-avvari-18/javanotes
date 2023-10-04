
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;



public class Colleection 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        // Collection <Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();

        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();


        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);

        // System.out.println(nums.indexOf(5));
        // System.out.println("Value = " + nums.get(2));

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());
        

        // for(int num:nums)
        //     System.out.println(num);

    }
}
