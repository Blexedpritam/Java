public class Demo3 {
    public static void main(String[] args) {
        //int i = 1;

        //Comma seprated variation
        // for (int i = 2, j = 1; i <= 10 && j <=5; i++ ,j += 2){
        //     System.out.println(i *j);
        // }

        // boolean b =true;
        // for (int i = 1; b == true; i++){
        //     if(condition){
        //         b = false;
        //     }
        // }

        //Integers --> byte,short,int,long
        // Type promotions..

        // for(int i = 1; i <=10;i++){
        //     System.out.println(i);
        // }
        
        //Nested loops are also possible

       //PATTERN PRINTING

        //    for(int i = 1; i <=5;i++){
        //         for(int j =1; j <= i; j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //    }

       /*
            *
            * *
            * * *
            * * * *
            * * * * *
       */


       //Jump Statements in Java
       //Break , Continue

        //    boolean b = true;

        //    for (int i = 1; i <= 10; i++){
        //         System.out.println(i);

        //         if(b ==false){
        //             break;
        //         }
        //     }   

        //Whether a number is prime or not

        // int p = 9;
        // // 2,3,4,...6,7
        // int i;
        // for( i = 2; i < p; i++){
        //     if(p % i == 0){
        //         System.out.println("The number is not prime");
        //         break;
        //     }
        // }
        // if(i ==p){
        //     System.out.println("The number is prime");
        // }


        // for (int i =1; i <= 10; i++){

        //     if(i % 2 == 0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //Continue 
        // for(int i = 1; i <=10; i++){
        //     for(int j = 1; j <=i ;j++){
        //         System.out.print("*");

        //         if(j >=5){
        //             continue;
        //         }
        //     }
        //     System.out.println();
        // }

        //Labels

        first: for(int i = 1; i <=10; i++){
            second: for(int j = 1; j <=i ;j++){
                System.out.print("*");

                if(j >=5){
                    break first;
                }
             }
            System.out.println();
        }
    }    
}
