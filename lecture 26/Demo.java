
//String Construtors

class Demo{
    public static void main(String[] args) {
        String s1 = new String("");
        String s2 = new String("hello");

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Pritam";
        String s4 = new String(s3);
        /*
            Heap --> S4 --> Pritam
            String Pool --> s3 --> Pritam        
        */
        System.out.println(s4);
        
        
        //Char Array 
        
        char [] arr = {'P','r','i','t','a','m', ' ','K','u','m','a','r'};
        String s5 = new String(arr); //values[]
        // arr[0] = 'B'; //It's not Change ...why ?  --> because it is Immutable...
        System.out.println(s5);
        

        //Char Array subset
        String s6 = new String(arr,0,6);//Starting Index and Ending Index
        // [0 , 6) 0th index ko include krna hai aur 6 index  ko exclude krna hai 
        System.out.println(s6);


        //Byte Array

        byte [] arr2 = {97,98,99};
        String s7 = new String(arr2 , 0,2);
        System.out.println(s7);
        
    }
}



