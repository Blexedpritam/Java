public class code{
    public static void main (String [] xyz){
        // 1.Implicit conversion
        //byte to int 
        // byte b = 24;
        // int  i;
        // i = b;
        // System.out.println(i);

        // character to int 
        // char c = 'a';
        // int a ;
        
        // a = c;
        // System.out.println(a);

        // 2.Explicit Conversion 
        // int i = 300;
        // byte b;  // -128 to +127
       
        // b = (byte) i;
        // System.out.println(b); // 300 % 256 = 44

        //3. truncating conversion
        float f = 12.356f;
        int i ;

        i =(int)f;
        System.out.println(i) ;

        //Boolean to any data type 
        //These are not possible
        // boolean bool = true;
        // int i;
        // i =(int)bool;
        // System.out.println(i);
        
        byte b = 50;
        b = (byte) (b*2);
        System.out.println(b);
    }
}