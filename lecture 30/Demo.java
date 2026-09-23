// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.List;

import java.util.*;


//Iterable 

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> iterator= list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

// 10,20,30,40,50
