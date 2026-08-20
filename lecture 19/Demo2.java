// Inner class 

public class Demo2 {
    public static void main(String[] args) {

        Outer outer = new Outer();
        
        // Outer.Inner inner = new Outer.Inner();

        Outer.Inner inner = outer.new Inner();

        // Outer.Inner inner = new Outer().new Inner(); // only use of inner class .."no uses of outer classes."
        inner.meow();
        // inner.fun();
        Outer.Inner.fun();


    }
}


class Outer{

    int x = 10;

    

    class Inner{

        // int x = 20;

        // Outer outer; implicit avilable (it's works internally.)

        void meow(){
            System.out.println(x);//"(Outer.x) its works internally" //Shadow kr deta hai main class ke variabke ko..
            // System.out.println(Outer.this.x); 
        }

        static void fun(){
            System.out.println("hello");
        }
        //Before Java 16 --> it show's error in inner class.
    }
}
