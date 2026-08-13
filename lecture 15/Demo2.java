
public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;
        x = 5;
        // x = 6; //The final local variable x may already have been assigned...
        System.out.println(x);

        //Cannot make a static reference to the non-static method print.
        print();

    } 
    
    static void print(){

    }
}
// Why main is static in java ??
// Demo4 d1 = new Demo4();
//d1.main()
//Demo4.main()


class Random{
    final double PI;

    Random(){
        this.PI = 3.14;
    }

    // static final double PI;
    // static{
    //     PI = 3.14;
    // }

}
