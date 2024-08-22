public class trappingRainwater {

    public static void WaterLevel(int height[]) {
        if (height.length <= 2) {
            System.out.println("No water is trapped.");
        } else {
            // calculate left max boundary in array form
            int leftMax[] = new int[height.length];
            leftMax[0] = height[0];
            for (int i = 1; i < height.length; i++) {
                leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            }
            // calculate right max boundary in array form
            int rightMax[] = new int[height.length];
            rightMax[height.length - 1] = height[height.length - 1];
            for (int i = height.length - 2; i >= 0; i--) {
                rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            }
            int trappedWater = 0;
            // loop
            for (int i = 0; i < height.length; i++) {
                int waterLevel = Math.min(leftMax[i], rightMax[i]); // waterLevel = min(left max , right max)
                trappedWater += waterLevel - height[i]; // trapped water = waterLevel - height[i]
            }
            System.out.println(trappedWater);

        }
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        WaterLevel(height);
    }
}