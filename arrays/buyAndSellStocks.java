package arrays;

public class buyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = {1,2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0, n = prices.length;
        int rst[] = new int[n];
        int tp[] = new int[n];

        rst[n-1] = prices[n-1];
        for (int i = n-2; i >= 0; i--) {
            rst[i] = Math.max(prices[i], rst[i+1]);
        }
        for (int i = 0; i < n; i++) {
            tp[i] = rst[i] - prices[i] ;
        }


        int hp = tp[0];
        for (int i = 1; i < n; i++) {
            if(hp >= tp[i]){
                profit = hp;
            }
            else{
                hp = tp[i];
                profit = hp;
            }
        }
        return profit;
    }
}

