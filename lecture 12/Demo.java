public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name ="Pritam";
        s1.age =20;
        s1.rollNumber =24100;
        s1.college ="Arcade Bussiness College";

        s2.name ="Priyanshu";
        s2.age =23;
        s2.rollNumber =24103;
        s2.college ="Arcade Bussiness College";

        s1.markAttendence();
        s2.markAttendence();

        s1.print();
        s2.print();

    }
}


class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendence(){
        System.out.println("Attendance marked by " + name);
    }

    void print(){
        System.out.println(name + " , " + age + " , "+ rollNumber + " , " + college);
    }
}

// Java is almost complete object oriented programming