public class Demo7 {
    public static void main(String[] args) {
        // Box<Fish> box = new Box<>();

        Box<Animal> box = new Box<>();


    }
}

// T<extends class & Interface1 , Interface2> --> Standard way
class Box <T extends Animal>{
    T value;
}


class Animal{
    void  display(){
        System.out.println("Display animal ");
    }
}

interface  Swimmable{
    void swim();
}

class Dog extends Animal{

}
class Fish extends Animal implements Swimmable{
    @Override 
    public void swim(){
        System.out.println("Fish is Swimming");
    }
}


