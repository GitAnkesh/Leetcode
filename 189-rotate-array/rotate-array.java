class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static  int[] reverse(int []arr,int fi,int li ){
        while(fi<li){
            int temp=arr[fi];
            arr[fi]=arr[li];
            arr[li]=temp;

            fi++;
            li--;

        }
        return arr;
        
    }
}