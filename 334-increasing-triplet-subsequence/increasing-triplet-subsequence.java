class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                // Update the first minimum
                first = num;
            } else if (num <= second) {
                // Update the second minimum
                second = num;
            } else {
                // We found a third number greater than both first and second
                return true;
            }
        }
 
        return false;
    }
}