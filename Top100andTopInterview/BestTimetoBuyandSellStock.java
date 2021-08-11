package Top100andTopInterview;

import java.util.HashMap;
import java.util.Map;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock best = new BestTimetoBuyandSellStock();
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(best.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int[] dp = new int[prices.length + 1];
       // Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < prices.length -1; i++) {
            int count = i;
            while (count < prices.length) {
                //if (prices[count] > prices[i]) {
                   // int temp = prices[count] - prices[i];
                    max = Math.max(prices[count] - prices[i], max);
                //}
                count++;
            }
        }
        return max;
    }
}
