package assesment;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;

        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) {
                c++;
            } else {
                break;
            }
        }

        String commonPrefix = first.substring(0, c);
        System.out.println(commonPrefix);
    }
}
