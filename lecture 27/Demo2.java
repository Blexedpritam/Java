

public class Demo2 {
    public static void main(String[] args) {
        // Box box = new Box(10);
        // System.out.println(box.getValues());

        // Box box2 = new Box("10");


        Box box = new Box(10);
        Box box2 = new Box("Hello");
        Box box3 = new Box(true);
        // System.out.println(box.getValue() + 5);

        //Downcasting
        Integer integer = (Integer) box.getValue();
        String string = (String) box2.getValue();
        Boolean boolean1 = (Boolean) box3.getValue();

        System.out.println(integer + 5);
        System.out.println(string + "Pritam");
        System.out.println(boolean1);

    }    
}

//Boject  --> to generic(Type information is Lost)

// A Class which can hold anything..
class Box{
    private Object value;

    Box(Object value){
        this.value = value;
    }

    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value){
        this.value = value;
    }


}
















// class Box{
//     private int values;

//     Box(int values){
//         this.values = values;
//     }

//     public int getValues(){
//         return  this.values;
//     }

//     public void setValues(int values){
//         this.values = values;
//     }

// }

