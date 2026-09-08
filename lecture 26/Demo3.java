public class Demo3 {
    public static void main(String[] args) {
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pritam");
        stringBuilder.append(" Kumar");
        stringBuilder.append("aaaaa");
        // System.out.println(stringBuilder);

        //insert()
        // stringBuilder.insert(2,"o"); // Pritam --> Proitam 
        // System.out.println(stringBuilder);

        //delete()
        // stringBuilder.delete(0, 2);
        // System.out.println(stringBuilder);

        //deleteCharAt()
        // stringBuilder.deleteCharAt(1);
        // System.out.println(stringBuilder);

        //replace()
        // stringBuilder.replace(1,3,"Xy");
        // System.out.println(stringBuilder);

        //reverse()
        // stringBuilder.reverse();
        // System.out.println(stringBuilder);

        //charAt()
        stringBuilder.charAt(1);// We se particular index
        System.out.println(stringBuilder);

        //setCharAt()
        stringBuilder.setCharAt(3, 'r');
        System.out.println(stringBuilder);


        //length()
        System.out.println(stringBuilder.length());
        //capacity()
        System.out.println(stringBuilder.capacity());

        //ensureCapacity()
        // stringBuilder.ensureCapacity(100);
        System.out.println(stringBuilder.capacity());

        //trimToSize()
        stringBuilder.trimToSize();
        System.out.println(stringBuilder.capacity());

    }
}
