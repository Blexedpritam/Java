public class Demo6 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.value = 20;
        box.printDouble();
    }
}

//Genric --> T can be Anything
//Bounds In Genric

//Upeer Bound --> T is atleast Number or its subtype

class Box <T extends  Number>{
    T value;

    public void printDouble(){
        System.out.println(value.doubleValue());
    }

}