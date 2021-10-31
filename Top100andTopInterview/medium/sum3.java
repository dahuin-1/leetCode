package Top100andTopInterview.medium;

import java.util.*;

public class sum3 {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        sum3 sum3 = new sum3();
        System.out.println(sum3.threeSum(nums));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]) {
                int start = i + 1; int end = nums.length-1; int newNum = -nums[i];
                while (start < end) {
                    if (nums[start] + nums[end] == newNum) { //애들의 합이 0 - nums[i]라면
                        resultList.add(Arrays.asList(nums[i], nums[start], nums[end])); //list에 넣기
                        while (start < end && nums[start] == nums[start + 1]) start++; // 같은 값은 제외
                        //ex)nums[i]=-1, 나머지 둘이 같은 값(둘다 -1)이면 같은 결과(둘다 2)니깐 제외
                        while (start < end && nums[end] == nums[end - 1]) end--; // 같은 값은 제외
                        start++; end--; //하나씩 앞으로 뒤로 땡겨보기
                } else if (nums[start] + nums[end] < newNum) start++; // ex) -3 < nums[i] 라면, 앞에거 한칸 보내기
                    else end--; // ex) -3 > nums[i] 라면,
                }
            }
        }
        return resultList;
    }
}
