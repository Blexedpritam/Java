public class code2 {
    public static void main(String[] agrs){
        byte b = 42;
        char c = 'a';
        short s =1024;
        int i = 50000;
        float f =5.6f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * 5);
        
        //f * b --> float 
        // i / c --> integer 
        //d * s --> double 

        // Float + integer  --> float - double --> double

       System.out.println((f *b) + " + " +( i / c) + " - " + ( d * 5));
       System.out.println("Result :" + result);
    }
}
