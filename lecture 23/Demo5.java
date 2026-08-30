public class Demo5 {
    public static void main(String[] args) {

        Direction[] direction = Direction.values();

        for(Direction d : direction){
            System   .out.println(d.name());
        }

        Direction direction2 = Direction.valueOf("EAST"); // Case Senstive
        System.out.println(direction2);
        
        System.out.println(direction2.ordinal()); // it's print it on array indexing..!!

    }
}
//Values() --> We can itterate in this enum
//ValuesOf() --> Convert a String into a enum constant
//name() --> it cant be override beacuse its final.
//toString() -->it can be override 
//ordinal()

/*
    toString() , equals() , hashCode() inner class methods.. 
*/

             
/*
    it cant be extends because its already extends with Enum class...but you can do implements ..
*/
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    // @Override
    // public String toString(){
    //     return this.name() + " "+ "Direction";
    // }
    
}
