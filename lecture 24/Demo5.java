public class Demo5 {
    public static void main(String[] args) {
        Vechicle vechicle = new Car();
        vechicle.drive();

        Vechicle.brake();

       
    }
}

// After Java 8 --> Defalut Methods : We can define methods , Static Methods
//Form java 9 --> Private  Methods 

//List Interface --> java have to intoduce new methods..

// interface List{
//     void pushBack();
// }

interface Vechicle {
    // void drive();
    default void drive(){
        System.out.println("Vechicle Driving");
        accelerate();
    };

    static void brake(){
        System.out.println("Vechile is Applying Break..!");
    }
    private void accelerate(){
        System.out.println("vechile is Accelarating");
    }
}

class Car implements Vechicle{
    // @Override
    // public void drive(){
    //     System.out.println("Car is Drivinng");
    // }
}
