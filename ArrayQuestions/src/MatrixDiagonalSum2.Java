class MatrixDiagonalSum2{
    public static void main(String[] args) {
        int[][] num = {
            {00,01,02,03,04},
            {10,11,12,13,14},
            {20,21,22,23,24},
            {30,31,32,33,34},
            {40,41,42,43,44}
        };
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < num.length; i++) {
            primary += num[i][i];
            if (i != (num.length - 1)/2){
            secondary += num[i][num.length -i - 1];
            }
        }
        System.out.println(primary + secondary);
    }

}