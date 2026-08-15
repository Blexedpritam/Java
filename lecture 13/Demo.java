public class Demo {
    public static void main(String[] args) {
        

        Student s1 = new Student();
        s1.name ="Pritam";
        s1.age = 20;
        s1.rollNum = 24100;
        s1.college ="Arcade";

        //Constructors --> To create an Ob 

        //Default Values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

       


        // int x;  // Local variable --> No default values
        // System.out.println(x);

    }
}

/*
Integer --> 0
Floating --> 0.0
Boolean --> false
String --> null (Nothing)

*/

class Student{
    String name;
    int age;     // Information/Data/Characteristics --> Instance Variables
    int rollNum;
    String college;

    void markAttendance(){  // Behaviours --> Functions --> Instance Methods
        System.out.println("Attendance marked by student" + name);
    }
}