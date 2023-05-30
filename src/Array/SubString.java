package ArrayList;

import java.util.HashSet;
import java.util.Set;

public class SubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabc"));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();

        Set<Character> characters = new HashSet<>();
        for (int i = 1; i < s.length(); i++) {
           characters.add(array[i]);
        }
        return characters.size();
    }
}
