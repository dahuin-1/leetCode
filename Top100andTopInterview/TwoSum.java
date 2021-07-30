package Top100andTopInterview;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] a = new int[]{2, 7, 11, 15};
        System.out.println(t.twoSum(a,9));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] answer = {};
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            if (map.containsKey(newTarget) && i != map.get(newTarget)) {
                answer = new int[]{i, map.get(newTarget)};
                return answer;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
