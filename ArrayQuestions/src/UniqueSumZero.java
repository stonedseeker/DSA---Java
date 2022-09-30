package ArrayQuestions.src;

import java.util.Arrays;

public class UniqueSumZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(solution(n)));
    }
    static int[] solution(int n){
            int[] ans = new int[n];
            if(n==1){
                ans[0]=0;
                return ans;
            }

            int m = 1;
            if (n % 2 == 0){
                for(int i = 0; i < n; i+=2){
                    ans[i] = m;
                    ans[i+1] = m * (-1);
                    m++;
                }
            }

            else{
                for(int i = 0; i < n - 1; i+=2){
                    ans[i] = m;
                    ans[i+1] = m * (-1);
                    m++;
                }
                ans[n - 1] = 0;
            }
            return ans;
    }
}
