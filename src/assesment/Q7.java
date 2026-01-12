package assesment;

public class Q7 {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] waterLevel = new int[n];
        int totalWaterHeight = 0;

        int max = height[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            leftMax[i] = max;
        }
        max = height[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }
//        for (int i : leftMax) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i : rightMax) {
//            System.out.print(i + " ");
//        }

//        System.out.println();
        for (int i = 0; i < n; i++) {
            int waterHeight = Math.min(leftMax[i], rightMax[i]) - height[i];
            waterLevel[i] = Math.max(waterHeight, 0);
        }
        for (int i : waterLevel) {
            totalWaterHeight += i;
        }
        System.out.println(totalWaterHeight);
    }
}
