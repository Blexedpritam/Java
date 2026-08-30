public class Demo3 {
    public static void main(String[] args) {
       Directions d = Directions.NORTH;
       System.out.println(d.getDegree()); 
    }
}

enum Directions{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);

   private int degree;

   Directions(int degree){
     this.degree = degree;
   }

   public int getDegree(){
        return this.degree;
   }
}
