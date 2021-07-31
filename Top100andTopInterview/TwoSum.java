package Top100andTopInterview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] a = new int[]{2, 7, 11, 15};
        System.out.println(t.twoSum(a,9));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int tempTarget = target - nums[i];
            if(map.containsKey(tempTarget)) {
                answer[0] = map.get(tempTarget);
                answer[1] = i;
                return answer;
            }
            map.put(nums[i], i);
        }
       return answer;
    }
}
