class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                res[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<res.length;i++){
            nums[i]=res[i];
        }
        return count;
    }
}