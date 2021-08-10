package Top100andTopInterview;

import java.util.HashMap;
import java.util.Map;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println( bestTimetoBuyandSellStock.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0 ; i < prices.length; i++) {
            map.put(i, prices[i]);
            int count  = i+1;
            while (map.get(count) > map.get(i)){
                int temp = map.get(i++) - map.get(i);
                max = Math.max(temp, max);
                count++;
            }
        }
        return max;
    }
}
