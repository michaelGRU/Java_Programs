
import java.util.Arrays;

/**
 *
 * @author michaelGRU
 *
 */
public class MultidimensionalArrays {

    public static void main(String[] args) {
        //creating a 2 by 3 matrix 
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        // 1 2 3
        // 4 5 6

        //say we want to access 6, in matrix algebra, its position is
        // (2,3), however, since array index starts at 0, we will minus 1 
        int temp = matrix[1][2]; //6 


        //*********************print array**************************************
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }

}
