
import java.util.HashSet;
import java.util.Set;

public class RotateMatrix90 {
    public static void main(String[] args) {

        int [][] matrix = {{0,1,2,0}
                          ,{3,4,5,2},
                           {1,3,1,5}};
        int n = matrix.length;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
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