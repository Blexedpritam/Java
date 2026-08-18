class Demo{
    public static void main(String[] args) {
        

        // Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();

        inner.fun();
        
       
    }
}

//Static Nested class
class Outer{

    static int x = 4;
    int y;

    static class Inner{

        Outer outer; 

        String name;
        static int number;

        Inner(){} // Default Constructor

        Inner(Outer outer){  // Paramtrized Cons..
            this.outer = outer;
        }

        void fun(){
            System.out.println(x);
            System.out.println(outer.y); // outer ka reference le raha hai ..!!
        }  
        
        static void fun2(){

        }
    }


}


class BankAccount{

    private static class InterestCalculator{
        static double  calulateYearly(double principal, double rate){
            return principal * rate;
        }
    }

    public double computeInterrest(double principal){
        return InterestCalculator.calulateYearly(principal, 0.09);
    }

}

/*
    Use caes of static nested classes:
        1.As helper class for any outer class.
        2.Builder Design pattern
        3.If you want to have static methods inside the class.
        4.Request/Response DTO.

*/
