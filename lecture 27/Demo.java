
public class Demo {
    public static void main(String[] args) {
        //Upcasting

        String string = "hello";
        Object object = string;
        System.out.println(object);


        //Downcasting
        Object object2 = "Pritam";
        String string2 = (String)object2;
        System.out.println(string2);


        Object object3 = 10;
        String string3 = (String) object3;
        System.out.println(string3);


        
    }    
}
