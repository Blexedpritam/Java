public class Demo2 {
    public static void main(String[] args) {
        //Multi Dimensional Arrays: 
        
        int [][] marks = new int[3][3]; // Rows , Cols
        marks[0][0] = 23;
        marks[0][1] = 25;
        marks[0][2] = 30;

        marks[1][0] = 23;
        marks[1][1] = 25;
        marks[1][2] = 30;

        marks[2][0] = 23;
        marks[2][1] = 25;
        marks[2][2] = 30;

        for(int row = 0; row < marks.length; row++){
            for(int col = 0; col < marks[row].length; col++){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }



        //Multi dimensional array --> each with diff length

        int[][] marks1 = new int [3][]; // Rows = 3

        marks1[0] = new int[2];
        marks1[1] = new int[3];
        marks1[2] = new int[4];

        /*
            [] [] 
            [] [] []  
            [] [] [] [] 
        
        */

        marks1[0][0] = 25;
        marks1[0][1] = 26;
        

        marks1[1][0] = 28;
        marks1[1][1] = 29;
        marks1[1][2] = 30;
        

        marks1[2][0] = 28;
        marks1[2][1] = 29;
        marks1[2][2] = 30;
        marks1[2][3] = 31;
        

       for(int row = 0; row < marks1.length; row++){
            for(int col = 0; col < marks1[row].length; col++){
                System.out.print(marks1[row][col] + " ");
            }
            System.out.println();
        }  
        
        
        // 1-D Array

        int[] rollNums = {101, 102, 103};

        for(int i = 0; i < rollNums.length; i++){
            System.out.println(rollNums[i]);
        }

        // 2-D Array

        int [][] marks2 ={
            {12, 13, 14},
            {15, 16, 17},
            {18, 19, 20}
        };

        for(int i = 0; i < marks2.length ; i++){
            for(int j = 0; j < marks2.length; j++){
                System.out.print(marks2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
