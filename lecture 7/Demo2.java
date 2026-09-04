public class Demo2 {
    public static void main(String[] args) {
        //Switch Statements
        int  i = 3;

        switch (i){ // switch(expression)-->byte,short,char,Enumeration
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break; 
            default:
                System.out.println("i is greater than 2");   
                break;
        }
    //Switch--> limited case --> should evalute to byte,short,int,char,Enumeration
    // no dupicate cases allowed.
    //After JDK7 strings can aslo be used as switch expression
    //After JDK-14 switch is enhanced to much.

        int j = 5;
        switch(j){
            case 4:
                System.out.println("j is not 4");
                break;
            case 5:
                System.out.println("j is 5");
                break;
                //Nested Switch Possible
            default:
                System.out.println("j is not 4 & 5");
        }

    }
}


