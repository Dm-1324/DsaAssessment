package assesment;

import java.util.ArrayList;
import java.util.List;

public class Q9 {

    static void permutation(int[] nums, int index, List<List<Integer>> permutation) {
        if (index == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int i : nums) {
                perm.add(i);
            }
            permutation.add(perm);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            permutation(nums, index + 1, permutation);
            int temp1 = nums[index];
            nums[index] = nums[i];
            nums[i] = temp1;


        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutation = new ArrayList<>();

        int index = 0;

        permutation(nums, index, permutation);

        System.out.println(permutation);


    }
}
