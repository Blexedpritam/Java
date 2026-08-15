public class Demo5 {
    public static void main(String[] args) {
        // EngineeringStudent es1 = new EngineeringStudent();
        // es1.name ="Pritam";
        // es1.age = 20;
        // es1.rollNumber = 24100;
        // es1.print();

        EngineeringStudent es2 = new EngineeringStudent("pritam", 28, 24100,"Arcade");
        es2.print();

    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    
    Student(){}

    Student(String name, int age, int rollNumber){
        this.name =name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    void print(){
        System.out.println(name + " ," + age + " ," + rollNumber);
    }
}

class EngineeringStudent extends Student{
    String college;

    EngineeringStudent(){

    }
    
    EngineeringStudent (String name,int age, int rollNumber, String college){
        super(name, age , rollNumber);
        // this.name =name;
        // this.age = age;
        // this.rollNumber = rollNumber;
        this.college = college;
    }

    void print(){
        super.print();
        System.out.println(college);
    }
   
}
