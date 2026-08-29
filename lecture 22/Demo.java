/*
    OBJECT CLASSES --> Parent of all  classes ..

    <<-- What in Object Classes -->>
        1.Core Methods :
            --toString();
            --equals();
            --hashCode();
            --getClasses();
        2.Clone :
           --clone()
        3.Garabge Collection :
            --Finalize();
        4.Threads :
            --wait();
            --notify();
            --notifyAll();


*/

import java.util.Objects;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.name = "pritam";
        s1.age = 20;
        /*
            toString Methods of Object class 
                Output will same
        */
        // System.out.println(s1.toString());
        // System.out.println(s1);

        Student s2 = new Student();
        s2.name = "pritam";
        s2.age = 20;

        // Student s3 = null;

        // Integer i = 25;
        // System.out.println(s1.equals(s2));

        // System.out.println(s1.hashCode() == s2.hashCode());


        // System.out.println(s1.getClass().getName());
        // System.out.println(s2.getClass().getName());

        // System.out.println(s1 instanceof Student);
        // System.out.println(s1 instanceof Object);
        
        Student s3 = (Student)s1.clone();
        System.out.println(s3.name);
        System.out.println(s3.age);


    }    
}

//InstanceOf operator --> If an Object is instance of a class or any of its subclass


//Cloabanle Interface..!?
class Student extends Object implements Cloneable {
    String name;
    int age;

    @Override
    public String toString(){
        return (name + " ," + age);
    }

    @Override
    public boolean equals(Object obj){

        if( this == obj) {
            return true;
        }

        //check if obj wi ll only declare..!!
        if (obj == null ) {
            return false;
        }
        //Check if both classes are of type of student 
        //If not checked --> classCastExceptions
        if(obj.getClass() != this.getClass()){
            return false;
        }

        Student s = (Student)obj;

        return (this.name == s.name && this.age == s.age);
    }

    @Override
    public int hashCode(){
        //Manullay...
        // int result = 17;
        // result = result *31 + age;
        // result = result *31 + name.hashCode();
        // result = result * 31 + ((name == null) ? 0 : name.hashCode());
        // return result;

        return Objects.hash(name,age);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
