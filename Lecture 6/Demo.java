public class Demo {
    public static void main (String [] boomb){
        //Operators in java 
        //Arithmatic Operators --> + ,- , * , / , % , += , -= , /= , %= , ++ , --
        
        int a = 5;
        int b = 10;

        int c = a + b;
        int d = a - b;
        int e = b / a;
        int f = a * b;
        int g =  b % a;

        System.out.println(c + "," + d + "," + e + "," + f + "," + g);

        int h = a + 2 ;
        // h = h + 2;// Since this is okay in CSE 
        h += 2; // h = h + 2; // h = 9
        h -= 2; // h = h-2;
        h *= 2; // h = h *2;
        h /= 5; // h = h / 2;
        h %= 5; // h = h % 2;

        System.out.println(h);

        int i = 6;
        i++; // i = i + 1 --> i += 1; 
        i--; // i = 1 - 1 --> i -= 1;
        System.out.println(i); // i =  6

        int j = 7;
        j++;//Postfix
        ++j; //Prefix

        //j = 9
        int k = j++; // k = j ; j = j + 1
        System.out.println(j + " , "  + k);

        int l = ++j;// l = j + 1;
        System.out.println(j + "," + l);
    }
}
