//Anoymous class

public class Demo4 {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.introduce();


        // Person p2 = new Guest();
        // p2.introduce();

        Person p3 = new Person(){
            String name = "pritam";

            @Override
            void introduce(){
                greet();
                System.out.println("yoo man..! " + name);

            }

            void greet(){
                System.out.println("namste..!!");
            }
            // Apply Inner class rule
            //Alg alg methos toh likh sakte hai ..pr jise override kr rahe hai usme hi ussse use kr sakte haii...
            //Cant Make Constructor..
        };

        p3.introduce();
        // p3.greet(); cant call..
    }
}

class Person{
    void introduce(){
        System.out.println("Hi, I am a person");
    }
}

// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("Hi , I am Guest");
//     }
// }

/*
    Static Nested classes
        |
    Inner Classes
        |
    Anonymous class --> Lamdas
        |
    Local class
*/