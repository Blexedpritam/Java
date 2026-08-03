import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Marks :");
        int marks = scanner.nextInt();

        if(marks >= 90){
            System.out.println("Your Grade A");
        }
        else if(marks >=75){
            System.out.println("Your Grade B");
        }
        else if(marks >=60){
            System.out.println("Your Grade C");
        }
        else if(marks >= 40){
            System.out.println("Your Grade D");
        }
        else if(marks < 40){
            System.out.println("Fail");
        }

        scanner.close();

    }
}
