public class Demo3 {
    public static void main(String[] args) {
        
        int x = 100;
        int y = 100; 
        System.out.println(x == y); //True


        // Integer a = 200;
        Integer a = 100;
        Integer b = 100;  //Integer caching mechanism in JVM
        // Integer b = 100;
        System.out.println(a == b); // False
        // System.out.println(a.intValue() == b.intValue()); //True
        // System.out.println(a.equals(b)); // True

    }    
}
