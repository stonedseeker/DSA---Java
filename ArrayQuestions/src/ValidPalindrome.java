package ArrayQuestions.src;

public class ValidPalindrome {
    public static void main(String[] args) {
    String s = "malayalam";
    palindrome(s);
    }
    static boolean palindrome(String s){
        String res = "";
        if (s.length() == 0 || s.length() == 1){
            return true;
        }else{
            char[] arr = new char[s.length()];

            for(int i = 0; i < arr.length / 2; i++){
                arr[i] = s.charAt(arr.length - 1 - i);
                res += arr.toString();
            }

            if (res == s){
                return true;
            }
        }
        return false;
    }
}
