import java.util.*;

public class TemperatureCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature :");
        int temp = scanner.nextInt();

        if(temp < 10){
            System.out.println("Very Cold");
        }
        else if(temp >=10 && temp <25){
            System.out.println("Moderate");
        }
        else if(temp >= 25){
            System.out.println("Hot");
        }
        scanner.close();
    }
}
