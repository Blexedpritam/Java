//Interfaces Deep Dive | Default Methods , Functional , Marker Interfaces..!!


public class Demo {
    public static void main(String[] args) {
        // Car c = new Thar();
        // c.drive();

        Payment payment = new CreditCard();
        payment.pay();

    }

}

interface Car{
    void drive(); // By default public hota hai...
}

abstract class Thar implements Car{
    @Override
    abstract public void drive();

    /*
        In case --> ye thar class override nhi krna chaati hai tabbb..  usss case mai hume uss interface ke method ko Abstract banna padega aur class ko bhi Abstract krna hoga ..

        e.g :
        abstract class Thar implements Car{
            abstract void drive();
        }
    
    */
}

/*
    Defalut "Access Modifire package ke anda rki acces kr skate hai !!"

*/

class BlackThar extends Thar{
    @Override
    public void drive(){

    }
}



//Dyamic Polymorphism Ya Dyamic Dispatch 
interface Payment {
    void pay();
}

class CreditCard implements Payment{
    @Override
    public void pay(){
       System.out.println("Paying via credit card"); 
    }
}

class DebitCard implements Payment{
    @Override
    public void pay(){
       System.out.println("Paying via debit card"); 
    }
}

