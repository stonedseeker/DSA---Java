package strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args ) {
//        System.out.println(subSeq("", "abc"));
        subseqAscii("", "abc");
        System.out.println(subSeqASC("", "abc"));
    }
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subSeq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p, up.substring(1));
        ArrayList<String> right = subSeq(p + ch, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAscii( String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p, up.substring(1));
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p + ch + 0, up.substring(1));
    }

    static ArrayList<String> subSeqASC(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqASC(p + ch, up.substring(1));
        ArrayList<String> second = subSeqASC(p, up.substring(1));
        ArrayList<String> third = subSeqASC(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
