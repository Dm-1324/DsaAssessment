package assesment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q3 {
    public static void main(String[] args) {
        int[] list1 = {1, 3};
        int[] list2 = {2};
        int medianPointer = 0;
        int secondMedianPointer = 0;
        float median = 0;

        List<Integer> list = Stream.concat(Arrays.stream(list1).boxed(), Arrays.stream(list2).boxed()).sorted().toList();
        System.out.println(list);
        int n = list.size();
        if (n % 2 != 0) {
            medianPointer = (n - 1) / 2;
            median = list.get(medianPointer);
            System.out.println(median);
        } else {
            medianPointer = (n / 2) - 1;
            secondMedianPointer = n / 2;
            median = (float) (list.get(medianPointer) + list.get(secondMedianPointer)) / 2;
            System.out.println(median);
        }


    }

}
