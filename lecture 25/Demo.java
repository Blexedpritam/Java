//Strings...

public class Demo {
    public static void main(String[] args) {
        String s1 = "hello"; // Literal way
        String s2 = "hello";

        s1.concat("world"); // thats prove String --> Immutable class

        System.out.println(s1 == s2);  // Ture 
        /*
            String pool : JVM checks ..same referance hain ya nahi  .. 
        */

        String s3 = new String("Pritam"); // Using new operator
        String s4 = new String("Pritam");

        System.out.println(s3 == s4);


        /*
            Golden Rule : 
                --> Only compile time constants go to string pool automatically 
                --> Runtime created string go to heap
        
        */

        String s5 = "Ja" + "va";  // Compile time : Ja + va = Java
        String s6 = "Java"; 
        System.out.println(s5 == s6); // True 


        String s7 = "ja"; // Literals  --> String Pools 
        String s8 = s7 + "va"; // va -> String pool --> uskke baad s7 + "va"  jayega heap mai-->  java 
        String s9 = "java"; // Literals --> String pools

        System.out.println(s8 == s9);


        String s10 = "Java"; 
        String s11 = s10;  // Assign kr diya gya  compile  time mai hii... toh ye dono varialbe Same String pool ka reference de rhe hoge... 

        System.out.println(s10 == s11); // True


        String s12 = "hello";
        s12 = "world";   // String pool --> value replace kr diya jayega ...

        System.out.println(s12);
        


        String s13 = new String("Pritam"); // Heap --> Pritam  and String Pool --> Pritam 
        String s14 = "Pritam"; //String Pool --> Pritam  

        System.out.println(s13 == s14); // Flase


    }
}

