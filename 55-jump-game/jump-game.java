class Solution {
    public boolean canJump(int[] nums) {
        int reachabble =0;
        for( int i =0; i<nums.length;i++){
            if(reachabble<i){
                return false;
            }
            reachabble =Math.max(reachabble,i+nums[i]);
        }
        return true;
    }
}