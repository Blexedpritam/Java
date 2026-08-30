public class Demo4 {
    public static void main(String[] args) {

        // Direction eastDirection = new Direction() {
        //     @Override
        //     public void move(){
        //         System.out.println("Move right (x + 1)");
        //     }
        // };
        // eastDirection.move();

        // Direction westDirection = new Direction() {
        //     @Override
        //     public void move(){
        //         System.out.println("Move left (x - 1)");
        //     }
        // };
        // westDirection.move();

        Direction d = Direction.NORTH;
        d.move();


    }
}

enum Direction{
    //With Anonymous Class
    NORTH{
        @Override
        public void move(){
            System.out.println("Move up (y + 1)");
        }
    },
    SOUTH{
         @Override
        public void move(){
            System.out.println("Move down (y - 1)");
        }
    },
    EAST{
         @Override
        public void move(){
            System.out.println("Move right (x + 1)");
        }
    },
    WEST{
         @Override
        public void move(){
            System.out.println("Move up (x - 1)");
        }
    };

    public abstract void move(); // Bina Abstract kiye override nhi kr sakte...!!
}










// abstract class Direction{
//     public abstract void move();
// }

// class NorthDirection extends Direction{
//     @Override
//     public void move(){
//         System.out.println("Move up (y + 1)");
//     }
// }

// class SouthDirection extends Direction{
//     @Override
//     public void move(){
//         System.out.println("Move down (y - 1)");
//     }
// }