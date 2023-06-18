package ArrayQuestions.src;

import java.util.ArrayList;
import java.util.List;

public class luckyNumbersinMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }

            }
            list.add(min);
        }

        for(int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                matrix[i][j] = matrix[j][i];
            }


        }

        System.out.println(list);
        List<Integer> res = new ArrayList<>();
        res.add(max);
        return res;
    }
}
