//Local classes

public class Demo3 {
    public static void main(String[] args) {
      Outer outer = new Outer();
      outer.greet();
        
    }
}

//Effective Final Variable

class Outer{

    // static private int x = 4;

    void greet(){

        // int y = 5;
        final int y = 5;
        //y++;

        // System.out.println("Namaste..!!");

        class Local{
            void sayHello(){
                System.out.println("Hello..,Kaise ho sarre...");
                // System.out.println(x);
                System.out.println(y);
            }
        }
        Local local = new Local();
        local.sayHello();
    }
}

/*
    Constructor
    Method
    If
    Loop
    Static Block
*/
