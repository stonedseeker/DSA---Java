public class MatrixDiagonalSum{
    public static void main(String[] args) {
        int[][] num = {
            {00,01,02,03,04},
            {10,11,12,13,14},
            {20,21,22,23,24},
            {30,31,32,33,34},
            {40,41,42,43,44}
        };
        System.out.println(diagonalSum(num));
    }

    public static int diagonalSum(int[][] mat) {
        int ans = 0;
        if (mat.length % 2 == 0) {
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
    }else{
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
            ans = ans - mat[(mat.length-1)/2][(mat.length-1)/2];
            return ans;
        }
    }
    
           return 0;
    }
        
    }
