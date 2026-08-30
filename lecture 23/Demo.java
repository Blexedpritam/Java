class Demo{
    public static void main(String[] args) {
       
        // int status = PaymentStatus.SUCESS;
        // System.out.println(status);
        
        // int status2 = 100;

        // if(status == Role.ADMIN){

        // }

        String status = PaymentStatus.SUCESS;
        System.out.println(status);
    }
}

/*
    * payement status --> sucess , failed , pending
    * Final
*/

/*
    Problems with this apporach;
    1.Type safety
    2.Poor Readability
    3.No grouping of related enitites
*/


class PaymentStatus{
    public static final String SUCESS = "Sucess"; //Constant name --> UpperCase 
    public static final String FAILED = "Failed";
    public static final String PENDING = "Pending";

}

class Role{
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int MANAGER = 2;
}