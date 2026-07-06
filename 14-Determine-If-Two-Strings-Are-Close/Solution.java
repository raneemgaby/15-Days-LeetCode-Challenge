import java.util.Arrays;
public class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] first = new int[26];
        int[] second = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            first[word1.charAt(i) - 'a']++;
            second[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((first[i] == 0 && second[i] != 0) || (first[i] != 0 && second[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
}
