
public class Demo3 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        // Student s2 = new Student("Pritam");
        // Student s3 = new Student("Ram", 20);
        // Student s4 = new Student("Prem", 20, 24100);
        // Student s5 = new Student("Rohan", 22, 24101, "Arcade");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

    }
}

// Constructor Chaining 
class Student{
    String name;
    int age;    
    int rollNum;
    String college;

    Student(){
        this("unknown");
        System.out.println("I am in first constructure");
    }

    Student(String name){
        this(name, 0 );
        System.out.println("I am in second constructure");

    }

    Student(String name, int age){
        this(name, age, 0);
        System.out.println("I am in third constructure");
       
    }
    Student (String name, int age , int rollNum){
        this(name, age, rollNum,"unknown");
        System.out.println("I am in fourth constructure");

    }

    Student (String name, int age, int rollNum, String college){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
        System.out.println("I am in fifth constructure");

    }


    void markAttendance(){  
        System.out.println("Attendance marked by student" + name);
    }
}