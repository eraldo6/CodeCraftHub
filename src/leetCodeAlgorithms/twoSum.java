package leetCodeAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementaryIndex = target - nums[i];
            if (numsMap.containsKey(complementaryIndex) && i != numsMap.get(target - nums[i])) {
                return new int[]{i, numsMap.get(complementaryIndex)};
            }

            numsMap.put(nums[i], i);
        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {

    }


}
