package assesment;

public class FactorialNonrec {
    public static void main(String[] args) {
        int N = 5;
        int fact = 1;

        for (int i = N; i >= 1; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
