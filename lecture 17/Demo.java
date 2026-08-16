
public class Demo {
    public static void main(String[] args) {
        
        // Car car = new Car();  //Cannot instantiate the type Car because of --> Abstraction 

        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();

        Car car2 = new ElectricCar();
        car.start();
        car2.accelerate();
        car2.brake();


    }
}

// Concreate class --> all methods are defined..



abstract class Car{
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerate();
       
    abstract void brake();
}


class FuelCar extends Car{
    
    @Override
    void accelerate(){
        System.out.println("Fuel car is accelerating");
    }

    @Override
    void brake(){
        System.out.println("Fuel car stoped");
    }
}

class ElectricCar extends Car{
    
    @Override
    void accelerate(){
        System.out.println("Electric Car is accelerating");
    }

    @Override
    void brake(){
        System.out.println("Electric Car is stoped");
    }
}
