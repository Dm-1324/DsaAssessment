package assesment;

public class Q2 {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3, 4};
//        int i = Arrays.stream(nums).reduce((a, b) -> a * b).orElseThrow();
//        System.out.println(i);
//        int[] newArray = Arrays.stream(nums).map(x -> i / x).toArray();
//
//        System.out.println(Arrays.toString(newArray));

        int[] nums1 = new int[]{-1, 1, 0, -3, 3};
        int[] left = new int[nums1.length];
        int[] right = new int[nums1.length];
        int[] answer = new int[nums1.length];
        int product = 1;
        int rightProduct = 1;
        for (int j = 0; j < nums1.length; j++) {
            left[j] = product;
            product *= nums1[j];
        }
        for (int j = nums1.length - 1; j >= 0; j--) {
            right[j] = rightProduct;
            rightProduct *= nums1[j];
        }
        for (int k = 0; k < nums1.length; k++) {
            answer[k] = left[k] * right[k];
        }
        for (int k : answer) {
            System.out.print(k + " ");
        }

    }
}
