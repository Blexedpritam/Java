
public class Demo2 {
    public static void main(String[] args) {
        
        Student s1 = new Student("Pritam", 20 , 24100, "Arcade");
        
        // Student s2 = new Student();
        
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);
    }
}

class Student{
    String name;
    int age;    
    int rollNum;
    String college;

    //Default Constructor
    Student(){
     
    }

    Student(String n, int a, int rn, String clg){
        name = n;
        age = a;
        rollNum = rn;
        college = clg;
    }

    void markAttendance(){ 
        System.out.println("Attendance marked by student" + name);
    }
}