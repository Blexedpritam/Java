import java.util.*;

class Demo{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

     
        // System.out.println(list.get(2));

        //list.set(1,4);

        //list.addAll(0, List.of(9,8,7));
        // System.out.println(list);

        // list.remove(1);
        // System.out.println(list);

        list.indexOf(2);
        list.lastIndexOf(5);

        // ListIterator<Integer> iterator = list.listIterator(2);

        // while(iterator.hasPrevious()){
        //     System.out.println(iterator.previousIndex());
        //     iterator.previous();
        // }

        List<Integer> l = List.of(1,2,3,4,5,6,7,8,9);
        // l.add(11);  // its render exceptions..!! because it's immutable !! 
        
        List<Integer> l2 = List.copyOf(l);
        // l2.add(12);
        System.out.println(l2);


    }
}