
public class Demo5 {
    public static void main(String[] args) {
        Integer integer = getResult(20);
        System.out.println(integer);

        printPair("Hello My name is IDK Programmer", 1000); // Type Inference

    }  
    
    public static <Pritam> Pritam getResult(Pritam x ){ //Type Parameter
        return  x;
    }

    public static  <T, U> void printPair(T first , U second){
        System.out.println(first + "  " +  second);
    }

}


//Generic Methods
// <Pritam> returnType  MethodName (Pritam parameter){ Do something}