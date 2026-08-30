public class Demo2 {
    public static void main(String[] args) {
        // int status = PaymentStatus2.SUCESS;

        /*
            <-- Type Safety-->
        */
        PaymentStatus status = PaymentStatus.SUCESS;
        // PaymentStatus status = 100;
        System.out.println(status.name());
    }
}

// Enum --> Enumerations (Enumerated type)
// Enum --> Predefine set of constants.


enum PaymentStatus{
    SUCESS,
    FAILED,
    PENDING;
}

class PaymentStatus2{
    public static final int SUCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;

}