public class MatrixDiagonalSum{
    public static void main(String[] args) {
        int[][] num = {
            {00,01,02,03},
            {10,11,12,13},
            {20,21,22,23},
            {30,31,32,33}
        };
        System.out.println(diagonalSum(num));
    }

    public static int diagonalSum(int[][] mat) {
        
        int ans = 0;
    
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                if(i == j){
                    ans += mat[i][j];
                }

            }
        }
        System.out.println(ans);

        for (int i = 0; i <= mat.length - 1;){
            for (int k = mat[i].length - 1; k >= 0; k--) {
                ans += mat[i][k];
                i++;
                System.out.println(ans);
            }
            return ans;
        } 
    
           return 0;
    }
        
    }
