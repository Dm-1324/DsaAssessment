package assesment;

public class Q13 {
    public static void main(String[] args) {
        String s = "anas";
        int n = s.length();
        String finalString = "";
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String temp = s.substring(left + 1, right);
            if (temp.length() > finalString.length()) finalString = temp;


            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            temp = s.substring(left + 1, right);
            if (temp.length() > finalString.length()) finalString = temp;
        }
        System.out.println(finalString);

    }
}
