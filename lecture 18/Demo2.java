public class Demo2 {
    public static void main(String[] args) {
        //Autoboxing 

        int x = 10;
        Integer y = x; //  Autoboxing
        // Integer y = Integer.valueOf(x);

        System.out.println(x);
        // System.out.println(y);
        System.out.println(y.intValue()); // Unboxing 


        // //Unboxing
        Integer a = 20; // Autoboxing
        // Integer a = Integer.valueOf(20);
        int b = a; // Unboxing

        System.out.println(a);
        System.out.println(b);

        int z = 200; 
        printInteger(z);

        Integer num1 = 10;
        Integer num2 = 40;

        int sum = num1 + num2;
        System.out.println(sum);

        //Null Pointer
        // Integer n = null;
        // int m = n; 
        // System.out.println(m); 
    }

    static void printInteger(Integer z){
        System.out.println(z);
    }
}

/*
    Autoboxing & Unboxing
    1. Assignments
    2. Method Calls
    3. Arthmetic Operations 

*/

