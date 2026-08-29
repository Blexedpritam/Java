
public class Demo2 {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Animal b = new Dog();

        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(a instanceof Animal);
        System.out.println(b instanceof Animal);
    }
}

class Animal{

}

class Dog extends Animal{

}