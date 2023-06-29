package strings;

public class SkipChar {
    public static void main(String[] args) {
        System.out.println(skipCharacter("baccad"));
    }

    private static String skipp(String str, char target) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != target) ans += c;
        }
        return ans;
    }

    private static void skip(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
    }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    private static String skipCharacter(String up) {
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            return skipCharacter(up.substring(1));
        } else {
            return ch + skipCharacter(up.substring(1));
        }
    }
}
