class Solution {
    public int jump(int[] nums) {
        int totalJump = 0;
        int coverage = 0;
        int lastJumpIndex = 0;
        int destination = nums.length - 1;
        
        // Base case
        if (nums.length == 1) {
            return 0;
        }
        
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastJumpIndex) {
                if (coverage >= destination) {
                    return totalJump + 1;
                }
                lastJumpIndex = coverage;
                totalJump++;
            }
        }
        
        return totalJump;
    }
}
