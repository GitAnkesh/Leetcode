class Solution {
    public int majorityElement(int[] nums) {
        Solution s = new Solution();
        int validCandidate =s.findValidCandidate(nums);
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == validCandidate){
                count++;
            }
        }
        if(count>=nums.length/2){
            return validCandidate;
        }
        return -1;
    }
    public  int findValidCandidate(int [] arr){
        int val=arr[0];
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(val ==arr[i]){
                count++;
            }else{
                count--;
            }
            if (count ==0){
                val =arr[i];
                count =1;
            }
        }
        return val;
    }
}