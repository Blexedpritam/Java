
public class Demo3 {
    public static void main(String[] args) {
        

        // A --> Reference A  <-- Static  "Call his own class not other"-->
        // A a = new B();
        // a.fun();

        C c = new D();
        // System.out.println(c.x);
        System.out.println(c.getX());



    }
    
}


/*Static --> Not apply Overiding 
    why ? --> they belong to class not to object

--> Private methods cant be overriden
--> Final Methods cannot be overriden 
--> Fields/ Variable they cannot be polymorphic

--> Final -> class ?? you cannot create child of that class
*/



class A{
    static void fun(){
        System.out.println("Hello A");
    }

    //The method fun2() from the type A is never used locally
    // private void fun2(){
    //     System.out.println("Hello A");
    // }

    final void fun3(){
        System.out.println("Hello A");
    }
}

class B extends A{
    static void fun(){
        System.out.println("Hello B");
    }

    //Cannot override the final method from A
    // final void fun3(){
       
    // }
}


class C{
    // int x = 10;

    int getX(){
        return 10;
    }
}

class D extends C{
    // int x = 20;

    int getX(){
        return 30;
    }
}