/*
Types of inheritance:
    Simple inheritance
    Multi-level inheritance
    Hierarchical inheritance
    Multiple inheritance(Not Supported In Java)
*/

public class Demo4 {
    public static void main(String[] args) {
        // CSEEngineeringStudents cs1 = new CSEEngineeringStudents();

        // cs1.getClass();
        // cs1.markAttedance();

    }
}

class Student{ //Parent  -->A
    String name;
    int age;

    public void markAttedance(){ 
        System.out.println("Attendance makred");
    }

}


class  EngineerStudent extends Student{ //Child --> B
    void attendLab(){
        System.out.println("Lab Attended for engineering student");
    }

}

class MedicalStudent extends Student{ // Child --> C
    void attendLab(){
        System.out.println("Lab Attended for medical student");
    }
}

// class CSEEngineeringStudents extends EngineerStudent{
    
// }

/*
Multi-level inheritance

Student
|
EngineerStudent
|
CSEEngineeringStudents
*/


/*
Hierarchical inheritance
         A 
       /   \
      B     C

*/


/*
    A   B
    \   /    // Not Supported 
      C

*/

