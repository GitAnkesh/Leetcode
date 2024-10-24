class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[m + n];

        // Merge until one of the arrays is exhausted
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of nums1 (if any)
        while (i < m) {
            res[k] = nums1[i];
            i++;
            k++;
        }

        // Copy the remaining elements of nums2 (if any)
        while (j < n) {
            res[k] = nums2[j];
            j++;
            k++;
        }

        // Copy the result back into nums1
        for (int index = 0; index < res.length; index++) {
            nums1[index] = res[index];
        }
    }
    
}