

public class Demo3 {
    public static void main(String[] args) {
        
        Box<Integer> box = new Box<>(10); // Type Arguments
        Box<String> box2 = new Box<>("Hello");
        Box<Boolean> box3 = new Box<>(true);

        System.out.println(box.getValue() + 5);
        System.out.println(box2.getValue() +  " Pritam , Kya haal hai ");
        System.out.println(box3.getValue());


    }    
}

//Genrics --> General Purpose Class 

class Box <P>{ // Type paramter
    private P value;

    Box(P value){
        this.value = value;
    }

    public P getValue(){
        return this.value;
    }

    public void setValue(P value){
        this.value = value;
    }


}

//Type Information is not lost 
