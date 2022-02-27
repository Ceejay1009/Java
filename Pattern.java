import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        //int [][] arr = {{9,9,9,9,2},{1,6,2,2,9},{4,2,6,2,2},{4,2,2,3,2},{0,2,2,1,8}};
        //int [][] arr = {{4,1,2,3,4},{4,4,3,2,1},{4,1,2,3,4},{4,4,3,2,1},{5,1,2,3,4}};
//        int [][] arr = {
//                {0,1,2,3,5},
//                {5,4,3,4,1},
//                {6,3,4,1,4},
//                {7,4,1,2,3},
//                {4,1,2,3,4}};
//        int [][] arr = {
//                {1,1,2,3,4},
//                {3,1,3,2,1},
//                {5,3,1,3,4},
//                {3,4,7,1,1},
//                {7,1,2,3,4}};

        int row, column;
        Scanner input = new Scanner(System.in);
        //asking user for row and column number
        System.out.print("Please enter the Row number: ");
        row = input.nextInt();
        System.out.print("Please enter the Column number: ");
        column = input.nextInt();
        //create arr
        int [][] arr = new int[row][column];
        //asking for the value in the arr
        System.out.println("Please enter the value in the array: ");
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        //print arr
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println(isConsecutiveFour(arr));
    }


    public static boolean isConsecutiveFour(int[][] arr){
        // check row
        for(int i = 0; i < arr.length; i ++ ){
            int CompairValue = arr[i][0];
            int ConsecutiveCount = 1;
            for(int j = 0; j < arr[i].length; j++) {
                if (CompairValue == arr[i][j]) {
                    ConsecutiveCount++;
                    if (ConsecutiveCount == 4) {
                        return true;
                    }
                } else {
                    CompairValue = arr[i][j];
                    ConsecutiveCount = 1;
                }
            }
        }

        // check column
        for(int i = 0; i < arr[0].length; i ++ ){
            int CompairValue = arr[0][i];
            int ConsecutiveCount = 1;
            for(int j = 0; j < arr.length; j++) {
                if (CompairValue == arr[j][i]) {
                    ConsecutiveCount++;
                    if (ConsecutiveCount == 4) {
                        return true;
                    }
                } else {
                    CompairValue = arr[j][i];
                    ConsecutiveCount = 1;
                }
            }
        }

        // check top right to bottom left
        for(int i = 0; i < arr.length; i++){
            int CompairValue = arr[i][arr[i].length - 1];
            int ConsecutiveCount = 1;
            for(int j = arr[i].length - 1, k = 0;
                j >= 0 && k < arr.length; j--, k++) {
                    if(CompairValue == arr[k][j]){
                        ConsecutiveCount++;
                        if(ConsecutiveCount == 4){
                            return true;
                        }
                    }else{
                        CompairValue = arr[k][j];
                        ConsecutiveCount = 1;
                    }
            }
        }
        // check bottom right to top left
        for(int i = arr.length - 1; i >= 0; i--){
            int CompairValue = arr[i][arr[i].length - 1];
            int ConsecutiveCount = 1;
            for(int j = arr[i].length - 1, k = arr.length - 1;
                j >= 0 && k >= 0 ; j--, k--) {
                if(CompairValue == arr[k][j]){
                    ConsecutiveCount++;
                    if(ConsecutiveCount == 4){
                        return true;
                    }
                }else{
                    CompairValue = arr[k][j];
                    ConsecutiveCount = 1;
                }
            }
        }
        return false;
    }
}
