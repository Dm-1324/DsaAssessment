package assesment;

public class Q10 {
    public static void main(String[] args) {
        char[][] board = {new char[]{'A', 'B', 'C', 'E'},
                new char[]{'S', 'F', 'C', 'S'},
                new char[]{'A', 'D', 'E', 'E'}};
        int i = 0;
        int j = 0;
        int posI = 0;
        int posJ = 0;
        int count = 0;

        String word = "ABCCED";

        for (char s : word.toCharArray()) {
            if (board[i++][j] == s) {
                posI = i - 1;
                board[i - 1][j] = ' ';
                count++;
            } else if (board[i][j++] == s) {
                posJ = j - 1;
                board[i][j - 1] = ' ';
                count++;
            }
            System.out.println(posI + "," + posJ);
            i = posI;
            j = posJ;
        }
        System.out.println(count);


    }
}
