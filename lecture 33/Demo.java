import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Pritam");
        set.add("Rohit");
        set.add("Sumit");
        set.add("Sumit");

        System.out.println(set);
        System.out.println(set.contains("Sumit"));
        
        //After added the new set.add  .. it is not updated the main set !! 
        set.add("Priyanshu");
        System.out.println(set);

        Map<Integer,String> map = new HashMap<>();
        map.put(101, "Pritam");
        map.put(102, "Anshika");
        map.put(102, "Arrti");

        System.out.println(map.containsKey(102));
        System.out.println(map.get(102));


    }    
}
