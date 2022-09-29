
//uncomplete
import java.util.Arrays;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };

        int[][] b = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
    System.out.println(multi(a,b));
    }
    static int[][] multi(int[][] a, int[][]b) {
        int[][] res = a;
        
        for(int i = 0; i < a[0].length; i++){
            int sum = 0;
            for(int j = 0; j < b[0].length; j++){
                sum += a[i][j] * b[j][i];
                res[i][j] = sum;
                sum = 0;
            }
            sum = 0;
            
        }

        for(int i = 0; i < res.length; i++){
            System.out.println(Arrays.toString(res[i]));
        }
        return res;
        
    }

}
