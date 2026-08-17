

public class Demo4 {
    public static void main(String[] args) {
        Animal a = new Dog("Dogesh Bhai");

        a.makeSound();
    }
}


abstract  class Animal{

    String name;
    
   
    Animal(String name){
        this.name = name;
    }

    abstract void makeSound();
    void sleep(){
        System.out.println("Sleeping");
    }
  
}

class Dog extends Animal{

    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Barking Sound");
    }

}







/*
    ABSTRACT CLASSES
        1.Cannot be instantiated directly
        2.Can contain abstract method(method without implementations)
        3.Can also contain normal methods.
        4.Is meant to be extended.
*/

/*
    Interview Questions
        1. Can Abstract Classes have constructor? --> yes
        2. Can Abstract Classes Final ?  --> Not Allowed 
        3. Can Abstract Class have Static methos/variables ?--> yes
        4. Can Abstract Classes have Private Methods ? --> yes but non abstract
        5. Can Abstract classes have Final Methods --> yes but non abstract
        6. Can Abstract Classes have no Abstract Method ?  --> yes 
*/