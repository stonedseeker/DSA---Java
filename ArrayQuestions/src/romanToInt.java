package ArrayQuestions.src;

import java.util.HashMap;
import java.util.Hashtable;

public class romanToInt {
    public static void main(String[] args) {
        System.out.println(rom("MCMXCIV"));
    }

    public static int rom(String r) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for (int i = 0; i < r.length();i++) {
//               char c1 = r.charAt(i); char c2 = r.charAt(i+1);
               if (i>0 && map.get(r.charAt(i)) > map.get(r.charAt(i-1))) {
                   res += map.get(r.charAt(i)) - 2*map.get(r.charAt(i-1));

               }
               else{
                   res +=  map.get(r.charAt(i));

                   }


        }
            return res;
    }
}

// #try 1
//    char c = r.charAt(i);
//            switch (c){
//        case 'I': res+= 1;break;
//        case 'V': res+= 5;break;
//        case 'X': res+= 10;break;
//        case 'L': res+= 50;break;
//        case 'C': res+= 100;break;
//        case 'D': res+= 500;break;
//        case 'M': res+= 1000;break;
//    }
//}
