import java.util.*;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age :");
        int age = scanner.nextInt();

        if(age >18){
            System.out.println("Eligibile for vote");
        }
        else{
            System.out.println("Not eligibile for vote");
        }
        scanner.close();
    }
}
