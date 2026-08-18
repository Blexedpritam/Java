// Inner class 

public class Demo2 {
    public static void main(String[] args) {

        Outer outer = new Outer();
        
        // Outer.Inner inner = new Outer.Inner();

        Outer.Inner inner = outer.new Inner();

        // Outer.Inner inner = new Outer().new Inner(); // only use of inner class .."no uses of outer classes."
        inner.meow();


    }
}


class Outer{

    class Inner{
        void meow(){
            System.out.println("Meow");
        }
    }
}
