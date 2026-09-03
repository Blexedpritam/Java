public class Demo7 {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}

// Java Resolution Priority rule : Aesa case jab ek class kisi class ko extend or implement krti hai ..aur usme koi methods hai ..toh hum humesha class wale method ko priority denge ..!!

interface A{
    default void fun(){
        System.out.println("Inside A interfaces");
    }
}

class B{
    public void fun(){
        System.out.println("Inside B CLass");
    }
}

class C extends B implements A{
    // @Override
    // public void fun(){
    //     System.out.println();
    // }
}
