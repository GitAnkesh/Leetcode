class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        // for(int j=0;j<nums.length;j++){  //[0,0,1,1,1,2,2,3,3,4]
        //     if(nums[i] !=nums[j]){
        //         nums[i+1]=nums[j];
        //         i++;
        //     }
        // }
        // return i+1;
        for(int j=0 ;j<nums.length;j++){
            if(nums[i] !=nums[j]){
                nums[i+1] =nums[j];
                i++;
            }
        }
        return i+1;
    }
}