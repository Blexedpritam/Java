public class Demo3 {
    public static void main(String[] args) {
        EngineerStudent es = new EngineerStudent();

        es.attendLab();
        es.markAttedance();

        Student  s1 = new Student();
        s1.markAttedance();
        // s1.attendLab(); // (wrong)
    }
}

/*
    parent(Supperlass) --> child (subclass)

*/


class Student{
    String name;
    int age;

    public void markAttedance(){
        System.out.println("Attendance makred");
    }

}


class  EngineerStudent extends Student{
    void attendLab(){
        System.out.println("Lab Attended");
    }
}