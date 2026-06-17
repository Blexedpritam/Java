public class Var_DataType {
    public static void main(String[]agrs){
        // Integers --> byte, short, int, long.
        // Binary(2), Octal(8), Hexadecimal (16) number system
        byte b = 5;
        // byte b = 0b101; // Binary
        // byte b = 07 ; // 0 - 7 --> octal
        // byte b = 0XA ; // Hexadecimal (0 - 15) --> 0-9, A,B,C,D,E,F
        short s = 10;
        int i = 1000;
        long l = 12_34_56_789; // for tens values "  For understanding coder" but the output will be <<--123456789 -->> ignore krta hai underscore ko..!!
       
        System.out.println("Integer Values --> " + b +" ," + s +" ," + i + " ," + l);

        // Real numbers
       float f =10.58f; //Single precision
       double d =23.097568; //Double precision --> Standard way
       double dd =6.022e23; //6.022 * 10^23
       System.out.println("Floating values -->" + f + " ," + d + " ," + dd);

        //Boolean
        boolean bool = true;
        System.out.println("Boolean values -->" +bool);
    }
}
