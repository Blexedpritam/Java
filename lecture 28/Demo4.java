import java.util.ArrayList;
import java.util.List;

// Generics with lower bound (super)

public class Demo4 {
    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);


    }


    public static void fun(List<? super Animal> values){
        //Writing
        values.add(new Animal());
        values.add(new Dog());
        values.add(new Cat());
        values.add(new Labrador());

        //Simple Reading is not allowed ..
        // for(Animal animal : values){}

        for(Object object : values){
            Animal a = (Animal)object;
            a.eat();
        }

    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("walking");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }

}


class Labrador extends Dog{

}

class Cat extends Animal{

}