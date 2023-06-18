public class richguy {
    public static void main(String[] args) {
        int [][] acc = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(acc));
    }
    static int maximumWealth(int[][] accounts){
        int sum = 0;
        int[] res = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            res[i] = sum;
            sum = 0;
    }

        int max = res[0];
        for (int i = 0; i < accounts.length; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
    return max;
    }

    public int maximumWealthalter(int[][] accounts) {
        int richest = 0;
        for(int[] account: accounts){
            int sum = 0;
            for(int i = 0; i < account.length; i++){
                sum += account[i];
            }

            richest = Math.max(sum, richest);
        }
        return richest;
    }


}
