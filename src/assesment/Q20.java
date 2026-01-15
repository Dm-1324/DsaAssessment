package assesment;

import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int[] frequentKey = new int[k];
        for (int i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((o1, o2) ->
                o2.getValue().compareTo(o1.getValue()));
        for (int i = 0; i < k; i++) {
            frequentKey[i] = list.get(i).getKey();
        }
        System.out.println(list);
        System.out.println(Arrays.toString(frequentKey));
    }
}
