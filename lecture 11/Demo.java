
public class Demo {
    public static void main(String[] args) {
        //Funtions in java
        

        greet();

        // String name = "pritam";
        sayHello("Pritam"); //Arguments
        
        // int x = getNumber();
        System.out.println(getNumber());

        System.out.println(multiply(50 ,90));

        return; // Optional
    }

    // No Ip, No Op
    static void greet(){
        System.out.println("hello");
        return;   //Optional
    }

    //Ip, No Op
    static void sayHello(String name){ //Numbers of parameters can be anything
        System.out.println("hello" + " " + name);
    }

    //No Ip , Op
    static int getNumber(){
        return 10; 
    }

    //Ip , Op
    static int multiply(int a, int b){
        // int mul = a * b;
        // return mul;/
        return (a * b);
    }
    
}
