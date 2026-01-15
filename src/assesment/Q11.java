package assesment;

import java.util.HashSet;
import java.util.Set;

public class Q11 {
    public static void main(String[] args) {
        String word = "abcbefg";

        int maxCount = 0;
        char[] charArray = word.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < charArray.length; right++) {
            char c = word.charAt(right);

            while (characterSet.contains(c)) {
                characterSet.remove(word.charAt(left));
                left++;
            }
            characterSet.add(c);
            maxCount = Math.max(maxCount, right - left + 1);
        }
        System.out.println(maxCount);


    }
}
