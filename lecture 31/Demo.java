// import java.util.Collection;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(01);
        c.add(02);
        c.add(03);
        c.add(04);

        //SIZE()
        // int n = c.size();
        // System.out.println(c.size());

        // System.out.println(c.isEmpty());
        //c.size == 0


        //boolean contains(object o) --> 01,02,03,04 --> equals()
        // System.out.println(c.contains(3));

        //iterate() --> Iterator

        //Object[] toArray()

        // Object[] objects = c.toArray();
        // for(Object o : objects){
        //     System.out.println(o);
        // }

        // Integer[] arrIntegers = new Integer[0];
        // Integer [] arr =c.toArray(new Integer[0]);
        // for (Integer integer : arr) {
        //     System.out.println(integer);
        // }

        // boolean add(E e);
        // boolean b = c.add(06);
        // System.out.println(b);

        // boolean remove(Object);
        // System.out.println(c.remove(2));
        // for (Integer integer : c) {
        //     System.out.println(integer);
        // }

        //boolean addAll(collection<? ectends E> c )
        // c.addAll(List.of(5,6,7,8,3,1));

        // System.out.println(c);

        //boolean containsAll(Collections<?> c);
        // System.out.println(c.containsAll(List.of(01,03,04,06)));

        //removeAll(collection<?> c);


        //boolean retainAll(Collection <?> c); --> Intersection
        // c.removeAll(List.of(1,2));
        // c.retainAll(List.of(1,2));

        // System.out.println(c);


        c.clear();
        System.out.println(c);


        //
    }    
}

//  add,remove,addall,removeall,retainall,conatins,conrtainsall,toarray,iterator ,size,isempty