import java.util.*;

public class greatestCandies {
    public static void main(String[] args) {
        int[] nums = {4,2,1,1,2};
        System.out.println(Arrays.toString(new List[]{(kidsWithCandies(nums, 1))}));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
           int max = candies[0];
           for (int i : candies) {
               if (i > max){
                   max = i;
               }
           }
           List<Boolean> ans = new ArrayList<Boolean>();
           for (int i = 0; i < candies.length; i++) {
               if (candies[i] + extraCandies >= max){
                   ans.add(true);
               }else{
                   ans.add(false);
               }
           }
           return ans;

    }
}

