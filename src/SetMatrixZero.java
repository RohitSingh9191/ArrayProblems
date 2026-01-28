
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    public static void main(String[] args) {

        int [][] matrix = {{0,1,2,0}
                          ,{3,4,5,2},
                           {1,3,1,5}};

        // Brut force TC n*3
        int row = matrix.length;
        int col = matrix[0].length;

        Set<Integer> setI =  new HashSet<>();

        Set<Integer> setJ =  new HashSet<>();

        for(int i = 0 ; i < row ; i++){

            for(int j = 0; j < col ; j++){

                if(matrix[i][j] ==  0){
                    setI.add(i);
                    setJ.add(j);
                }
            }
        }

        for(int i = 0 ; i < row ; i++) {

            for (int j = 0; j < col; j++) {

                if(setI.contains(i) || setJ.contains(j)){
                    matrix[i][j] = 0;
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // optimal Solution

        System.out.println("============================");

        int [][] matrixs = {{0,1,2,0}
                ,{3,4,5,2},
                {1,3,1,5}};
        int col0 = 1;

        // mark 1st row & col accordingly:


        for(int i = 0 ; i < row ; i++) {

            for (int j = 0; j < col; j++) {
                if (matrixs[i][j] == 0) {
                    // mark i-th row:
                    matrixs[i][0] = 0;

                    // mark j-th column:
                    if (j != 0)
                        matrixs[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
            // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    if (matrixs[i][j] != 0) {
                        // check for col & row:
                        if (matrixs[i][0] == 0 || matrixs[0][j] == 0) {
                            matrixs[i][j] = 0;
                        }
                    }
                }
            }

            //step 3: Finally mark the 1st col & then 1st row:
            if (matrixs[0][0] == 0) {
                for (int j = 0; j < col; j++) {
                    matrixs[0][j] = 0;
                }
            }
            if (col0 == 0) {
                for (int i = 0; i < row; i++) {
                    matrixs[i][0] = 0;
                }
            }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}