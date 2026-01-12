package assesment;

public class Q6 {
    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        int profit = 0;
        int sell = prices[0];
        for (int price : prices) {
            if (price < sell) {
                sell = price;
            } else if ((price - sell) > profit) {
                profit = price - sell;
            }
        }
        System.out.println(profit);
        
    }
}
