import java.util.*;
public class GreaterOfTwoNo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one number:");
        int i =scanner.nextInt();
        System.out.print("Enter second number:");
        int j = scanner.nextInt();

        if(i > j){
            System.out.println(i + " is greater");
        }
        else if(i < j){
            System.out.println(j + " is greater");
        }
        scanner.close();
    }
}