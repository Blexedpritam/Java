public class Demo2 {
    public static void main(String[] args) {

        //StringBuilder  / StringBuffer
        // StringBuilder stringBuilder = new StringBuilder("Hello");
        // String s1 = new String(stringBuilder);

        // System.out.println(s1);





        // String s2 = new String("Pritam");
        String s2 = new String("Pritam");
        String s3 = new String("Pritam");
        
        /*
            Length / Emptiness
        */
       System.out.println(s2.length());// 4
       System.out.println(s2.isEmpty()); //True / False
       System.out.println(s2.isBlank()); //True / False



       /*
        Character Access 
       */
      System.out.println(s2.charAt(2));
      char [] arr = s2.toCharArray();
      System.out.println(arr);

        /*
            Comparsion Method
        */
        System.out.println(s2.equals(s3));
    }
    
}
