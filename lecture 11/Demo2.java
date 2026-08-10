public class Demo2 {
    public static void main(String[] args) {
        //Function overloading

        int x =sum(10, 14);
        System.out.println(x);

        int y = sum(50, 60);
        System.out.println(y);

        int z = sum(88, 90);
        System.out.println(z);

        greet(20, "Pritam");
        greet("Rahul", 25);

        fun();
    }

    static int sum(int a , int b){
        return a + b;
    }
    static int sum(int a , int b, int c){  // Different no. of parameters
        return (a + b + c);
    }
    static int sum(double a, double b){ // Different type of paramters
        return (int)(a + b );
    }

    static void greet(String name, int age){
        System.out.println("hemlllo" + name + "your age  is " + age);
    }

     static void greet(int age , String name){
        System.out.println("hemlllo" + name + "your age  is " + age);
    }

    static void fun(){
        System.out.println("Meow");
    }

    static int fun2(){
        System.out.println("Meow");
        return 20;
    }

}
