import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Pritam");
        set.add("Rohit");
        set.add("Sumit");

        System.out.println(set);
        System.out.println(set.contains("Pritam"));
        
        //After added the new set.add  .. it is not updated the main set !! 
        set.add("Priyanshu");
        System.out.println(set);


    }    
}
