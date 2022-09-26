class MatrixDiagonalSum2 {
    public int diagonalSum(int[][] num) {
        int ans = 0;

        for (int i = 0; i < num.length; i++) {
            ans += num[i][i];
            ans += num[i][num.length -i - 1];
            }
        if (num.length % 2 != 0) {
        return ans - num[(num.length - 1)/2][(num.length - 1)/2];
         }else{
            return ans;
        }
        }
        
    }
