//TODO

package arrays;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution17 {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<String, String> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        map.put("2","abc");map.put("3","def");map.put("4","ghi");
        map.put("5","jkl");map.put("6","mno");map.put("7","pqrs");
        map.put("8","tuv");map.put("9","wxyz");

        StringBuilder bs = new StringBuilder();

        for (int i = 0; i < (int) Math.pow(3,digits.length()); i++){
            bs.append(map.get(digits.charAt(i)));
        }
        System.out.println(bs);
        return ans;
    }
}