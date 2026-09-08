public class Demo2 {
    public static void main(String[] args) {

        //StringBuilder  / StringBuffer
        // StringBuilder stringBuilder = new StringBuilder("Hello");
        // String s1 = new String(stringBuilder);

        // System.out.println(s1);





        // String s2 = new String("Pritam");
        String s2 = new String("Pritam");
        String s3 = new String("pritam");
        
        /*
            Length / Emptiness
        */
       System.out.println(s2.length());// 4
       System.out.println(s2.isEmpty()); //True / False
       System.out.println(s2.isBlank()); //True / False



       /*
        Character Access 
       */
      System.out.println(s2.charAt(2));
      char [] arr = s2.toCharArray();
      System.out.println(arr);

        /*
            Comparsion Method
            *equals():
                     --> In Java equals method does not compare the reference they comapre the values.
            *equalsIgnoreCase():
                                --> if in String there is any uppercase and lowercase are there but the values are the same ...then its "equal" means Ture. if not  then False.
            *compareTo():
                        --> Its does Lexicographical comparsion "Dictionary". It give output in integer "-ve , 0, +ve"

        */
        System.out.println(s2.equals(s3)); //equals() --> == --> References compare..
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.compareTo(s3));

        /*
            Searching
            *contains():
                     --> ye search krta hai ..kya usme koi string hai jo programer chaa raha hai search krna ..and more thing its search on same series if the series is then its output will be flase .
            *indexOf():
                     -->
            *lastIndexOf():
                     -->
            *startsWith():
                     -->
            endsWith():
                     -->
        
        
        */

        System.out.println(s2.contains("am"));//ture 
        System.out.println(s2.indexOf("i")); //2
        System.out.println(s2.lastIndexOf("ity"));//6
        System.out.println(s2.startsWith("Pri"));//true
        System.out.println(s2.endsWith("am"));//false

        /*
            Extraction / Transformation

            *substring():
                        -->
            *toLowerCase():
                        -->
            *toUpperCase():
                        -->
            *trim():
                    --> its trim side spaces not in between
            *strip():
                    -->Unicode friendly ..
            *repeat():
                    -->
            *repalce():
                    -->
            *replaceAll():
                    -->
        */
        System.out.println(s2.substring(1,4));//1 index included hai ..aur 4 index excluded hai.
        System.out.println(s3.substring(2));
        System.out.println(s3.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.trim());
        System.out.println(s3.strip());//Unicode friendly
        System.out.println(s2.repeat(5));
        System.out.println(s2.replace("i", "o"));
        System.out.println(s3.replaceAll("pri","ab"));

         /*
            Two important method --> split and String.join
         */
        String s4 = "Sumit-Raj-Prem";
        String array [] = s4.split("-");
        for(String s : array){
            System.out.println(s);
        }

        System.out.println(String.join("-", "Pritam-Suraj-Satyam"));

        /*
            Conversion
        
        */
       String s5 = new String(String.valueOf(10));
       System.out.println(s5);

       //Retrun ASCII Values
       byte [] array2 = s2.getBytes();
       for(byte b :array2){
            System.out.println(b + " ,");
       }

       /*
            Advanced Method
            
            *intern():
                --> ye heap se object ko string pool mai le jata hai 
            *format():
                 -->
       
       */


        String s6 = new String("Hello"); 
        String s7 = s6.intern(); // now its pointing on string pool 
        System.out.println(s6 == s7);

        String name = "Pritam";
        int age = 20;

        // To print on hello , your age is 20
        System.out.println("Hello" + " "+ name + " ," + " " + "Your age is " + age );
        System.out.println(String.format("Hello %s,Your age is %s" , name ,age));
    }
    
}
