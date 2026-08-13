public class Demo {
    public static void main(String[] args) {
      
        Student s1 =new Student("pritam", 20, 24100);

        Student s2 = new Student("Raghav", 20, 24101);

        // Student.college = "Arcade Bussiness College";

        System.out.println(s1.name + " ," + s1.age + " ," + s1.rollNumber +" ,"+Student.college);
        System.out.println(s2.name + " ," + s2.age + " ," + s2.rollNumber + " ,"+ Student.college);
    }
}


class Student{
    String name;
    int age;
    int rollNumber;
    static String college;
    // static int stdCode = 91;

    Student(String name, int age, int rollNumber){
        this.name = name;
        this.age  = age;
        this.rollNumber = rollNumber;
    }

    //Static Block
    static{
        college = "Arcade Clg";
    }
   
}
