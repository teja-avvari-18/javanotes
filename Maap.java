import java.util.HashMap;
import java.util.Map;


public class Maap 
{
    public static void main(String[] args) 
    {
        Map <String,Integer> students = new HashMap<>();

        students.put("Teja", 98);
        students.put("Tej", 89);
        students.put("Pod", 59);
        students.put("Tej", 69);

        // System.out.println(students.get("Tej"));

        // System.out.println(students);

        System.out.println("Values = "+students.values());

        System.out.println(students.keySet());

        for(String key:students.keySet())
            System.out.println(key+" : "+students.get(key));
    }
}
