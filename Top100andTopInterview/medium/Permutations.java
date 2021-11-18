package Top100andTopInterview.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(resultList, new ArrayList<>(), nums);
        return resultList;
    }
    
    public void backtracking(List<List<Integer>> resultList, List<Integer> tempList, int[] nums) {
        if(tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
        }else{
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtracking(resultList, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
