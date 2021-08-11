package Top100andTopInterview;

import java.util.HashMap;
import java.util.Map;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock best = new BestTimetoBuyandSellStock();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(best.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min)
                min = price;
            else if (price > min)
                max = Math.max(price - min, max);
        }
        return max;
    }
}
