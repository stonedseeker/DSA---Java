import java.util.HashSet;
import java.util.Set;

public class panagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<Character>();

        for(int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }


        return (set.size() == 26);
    }
}
