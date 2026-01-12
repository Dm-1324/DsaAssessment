package assesment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> valueMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int neededValue = target - nums[i];
            valueMap.put(nums[i], i);
            if (valueMap.containsKey(neededValue)) {
                System.out.println(Arrays.toString(new int[]{valueMap.get(neededValue), i}));
            }
        }

    }
}
